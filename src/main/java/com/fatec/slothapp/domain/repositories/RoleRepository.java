package com.fatec.slothapp.domain.repositories;

import com.fatec.slothapp.api.models.RoleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface RoleRepository extends JpaRepository<RoleModel, BigInteger>{
}
