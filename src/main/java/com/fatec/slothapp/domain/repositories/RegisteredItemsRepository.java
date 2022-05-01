package com.fatec.slothapp.domain.repositories;

import com.fatec.slothapp.api.models.RegisteredItemsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisteredItemsRepository extends JpaRepository<RegisteredItemsModel, String> {
}
