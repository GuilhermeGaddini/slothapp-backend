package com.fatec.slothapp.domain.repositories;

import com.fatec.slothapp.api.models.UserItemsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface UserItemsRepository extends JpaRepository<UserItemsModel, BigInteger>, UserItemsRepositoryCustom {
}
