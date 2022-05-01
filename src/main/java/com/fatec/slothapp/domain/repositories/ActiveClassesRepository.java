package com.fatec.slothapp.domain.repositories;

import com.fatec.slothapp.api.models.ActiveClassesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface ActiveClassesRepository extends JpaRepository<ActiveClassesModel, BigInteger>, ActiveClassesRepositoryCustom {
}
