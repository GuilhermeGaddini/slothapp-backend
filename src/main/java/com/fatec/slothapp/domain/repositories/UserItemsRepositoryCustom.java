package com.fatec.slothapp.domain.repositories;

import com.fatec.slothapp.api.models.UserItemsModel;

import java.math.BigInteger;
import java.util.List;


public interface UserItemsRepositoryCustom {

    UserItemsModel deleteByItemId(BigInteger itemId);

    List<UserItemsModel> findUserItemsByUserId(BigInteger userId);
}
