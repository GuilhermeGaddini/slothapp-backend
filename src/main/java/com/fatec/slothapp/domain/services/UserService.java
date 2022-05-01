package com.fatec.slothapp.domain.services;

import com.fatec.slothapp.api.models.RoleModel;
import com.fatec.slothapp.api.models.UserModel;
import com.fatec.slothapp.domain.repositories.RoleRepository;
import com.fatec.slothapp.domain.repositories.RoleRepositoryCustom;
import com.fatec.slothapp.domain.repositories.UserRepository;
import com.fatec.slothapp.domain.repositories.UserRepositoryCustom;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collection;

@Service @Transactional
public class UserService implements UserDetailsService {

    private final UserRepository userRepository;
    private final UserRepositoryCustom userRepositoryCustom;
    private final RoleRepository roleRepository;
    private final RoleRepositoryCustom roleRepositoryCustom;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, UserRepositoryCustom userRepositoryCustom, PasswordEncoder passwordEncoder,
                       RoleRepository roleRepository, RoleRepositoryCustom roleRepositoryCustom) {
        this.userRepository = userRepository;
        this.userRepositoryCustom = userRepositoryCustom;
        this.passwordEncoder = passwordEncoder;
        this.roleRepository = roleRepository;
        this.roleRepositoryCustom = roleRepositoryCustom;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserModel user = userRepositoryCustom.getUserByUsername(username);
        if (user == null){
            throw new UsernameNotFoundException("User not found in the database. Please check your information and try again!");
        }
        Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
        user.getRoles().forEach(role -> {
            authorities.add(new SimpleGrantedAuthority(role.getRoleName()));
        });
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), authorities);
    }

    public UserModel getUserByUsername(String username) {
        return userRepositoryCustom.getUserByUsername(username);
    }

    public UserModel createUser(UserModel user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    public RoleModel createRole(RoleModel role){
        return roleRepository.save(role);
    }

    public void addRoleToUser(String username, String roleName){
    UserModel user = userRepositoryCustom.getUserByUsername(username);
    RoleModel role = roleRepositoryCustom.getRoleByRoleName(roleName);
    user.getRoles().add(role);
    }
}
