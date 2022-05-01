package com.fatec.slothapp.domain.services;

import com.fatec.slothapp.api.models.RegisteredItemsModel;
import com.fatec.slothapp.domain.repositories.RegisteredItemsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegisteredItemsService {

    private final RegisteredItemsRepository registeredItemsRepository;

    public RegisteredItemsService(RegisteredItemsRepository registeredItemsRepository) {
        this.registeredItemsRepository = registeredItemsRepository;
    }

    public List<RegisteredItemsModel> getAllRegisteredItems() {
        return registeredItemsRepository.findAll();
    }
}
