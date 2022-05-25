package com.fatec.slothapp.domain.services;

import com.fatec.slothapp.api.models.UserCurrencyModel;
import com.fatec.slothapp.domain.repositories.UserCurrencyRepository;
import com.fatec.slothapp.domain.repositories.UserCurrencyRepositoryCustom;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;

@Service
public class UserCurrencyService {

    private final UserCurrencyRepository userCurrencyRepository;
    private final UserCurrencyRepositoryCustom userCurrencyRepositoryCustom;

    public UserCurrencyService(UserCurrencyRepository userCurrencyRepository, UserCurrencyRepositoryCustom userCurrencyRepositoryCustom) {
        this.userCurrencyRepository = userCurrencyRepository;
        this.userCurrencyRepositoryCustom = userCurrencyRepositoryCustom;
    }

    public UserCurrencyModel getUserCurrencyByUserId(BigInteger userId) {
        return userCurrencyRepositoryCustom.findUserCurrencyByUserId(userId);
    }

    public UserCurrencyModel discountItemPriceOnUserCurrency(int itemPrice, BigInteger userId){
        UserCurrencyModel userCurrencyModel = getUserCurrencyByUserId(userId);
        BigInteger userMoney = userCurrencyModel.getUserMoney();
        BigInteger itemPriceBI = BigInteger.valueOf(itemPrice);
        userCurrencyModel.setUserMoney(userMoney.subtract(itemPriceBI));
        lastPurchaseTimeStamp(userId);
        return userCurrencyModel;
    }

    public UserCurrencyModel addCurrencyToUser(int currencyValor, BigInteger userId){
        UserCurrencyModel userCurrencyModel = getUserCurrencyByUserId(userId);
        BigInteger userMoney = userCurrencyModel.getUserMoney();
        BigInteger currencyValorBI = BigInteger.valueOf(currencyValor);
        userCurrencyModel.setUserMoney(userMoney.add(currencyValorBI));
        return userCurrencyModel;
    }

    public void lastPurchaseTimeStamp(BigInteger userId){
        Date date = new Date();
        UserCurrencyModel userCurrencyModel = getUserCurrencyByUserId(userId);
        Timestamp lastPurchaseTS = new Timestamp(date.getTime());
        userCurrencyModel.setLastPurchaseTs(lastPurchaseTS);
    }
}
