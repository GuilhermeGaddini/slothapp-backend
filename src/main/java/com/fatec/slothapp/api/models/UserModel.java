package com.fatec.slothapp.api.models;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name = "users")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger userId;
    private String username;
    private String userEmail;
    private String password;
    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<RoleModel> roles = new ArrayList<>();

    public UserModel() {
    }

    public UserModel(BigInteger userId, String username, String userEmail, String password, Collection<RoleModel> roles) {
        this.userId = userId;
        this.username = username;
        this.userEmail = userEmail;
        this.password = password;
        this.roles = roles;
    }

    public BigInteger getUserId() {
        return userId;
    }

    public void setUserId(BigInteger userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Collection<RoleModel> getRoles() {
        return roles;
    }

    public void setRoles(Collection<RoleModel> roles) {
        this.roles = roles;
    }
}
