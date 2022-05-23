package com.fatec.slothapp.domain.services;

import com.fatec.slothapp.api.models.UserItemsModel;
import com.fatec.slothapp.domain.repositories.UserItemsRepository;
import com.fatec.slothapp.domain.repositories.UserItemsRepositoryCustom;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service
public class UserItemsService {

    private final UserItemsRepository userItemsRepository;
    private final UserItemsRepositoryCustom userItemsRepositoryCustom;

    public UserItemsService(UserItemsRepository userItemsRepository, UserItemsRepositoryCustom userItemsRepositoryCustom) {
        this.userItemsRepository = userItemsRepository;
        this.userItemsRepositoryCustom = userItemsRepositoryCustom;
    }

    public UserItemsModel getAllUserItemsByUserId(BigInteger userId) {
        return userItemsRepository.getById(userId);
    }

    public List<UserItemsModel> getAllUserItemsByItemName(String itemName) {
        return userItemsRepositoryCustom.findAllUserItemsByItemName(itemName);
    }

    public List<UserItemsModel> getAllUserItemsByItemType(String itemType) {
        return userItemsRepositoryCustom.findAllUserItemsByItemType(itemType);
    }

    public UserItemsModel insertUserItem(UserItemsModel userItemsModel){
        return userItemsRepository.save(userItemsModel);
    }

    public UserItemsModel removeUserItem(UserItemsModel userItemsModel){
        return userItemsRepositoryCustom.deleteByItemId(userItemsModel.getItemId());
    }
}

