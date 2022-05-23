package com.fatec.slothapp.domain.repositories;

import com.fatec.slothapp.api.models.UserItemsModel;

import java.math.BigInteger;
import java.util.List;

public interface UserItemsRepositoryCustom {

    List<UserItemsModel> findAllUserItemsByUserId(BigInteger userId);
    List<UserItemsModel> findAllUserItemsByItemName(String itemName);
    List<UserItemsModel> findAllUserItemsByItemType(String itemType);
    UserItemsModel deleteByItemId(BigInteger itemId);
}
