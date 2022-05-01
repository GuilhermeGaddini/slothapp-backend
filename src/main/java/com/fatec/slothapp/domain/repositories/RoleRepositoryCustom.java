package com.fatec.slothapp.domain.repositories;

import com.fatec.slothapp.api.models.RoleModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface RoleRepositoryCustom extends JpaRepository<RoleModel, BigInteger> {
    RoleModel getRoleByRoleName(String roleName);
}
