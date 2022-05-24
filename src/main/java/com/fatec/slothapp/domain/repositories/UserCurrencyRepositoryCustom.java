package com.fatec.slothapp.domain.repositories;

import com.fatec.slothapp.api.models.UserCurrencyModel;

import java.math.BigInteger;

public interface UserCurrencyRepositoryCustom {

    UserCurrencyModel findUserCurrencyByUserId(BigInteger userId);
}
