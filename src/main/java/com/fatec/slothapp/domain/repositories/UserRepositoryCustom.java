package com.fatec.slothapp.domain.repositories;

import com.fatec.slothapp.api.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;

import java.math.BigInteger;

public interface UserRepositoryCustom extends JpaRepository<UserModel, BigInteger> {

    UserModel getUserByUsername(String username);
}
