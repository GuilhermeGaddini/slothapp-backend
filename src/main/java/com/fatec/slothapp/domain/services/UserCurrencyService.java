package com.fatec.slothapp.domain.services;

import com.fatec.slothapp.api.models.UserCurrencyModel;
import com.fatec.slothapp.domain.repositories.UserCurrencyRepository;
import com.fatec.slothapp.domain.repositories.UserCurrencyRepositoryCustom;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class UserCurrencyService {

    private final UserCurrencyRepository userCurrencyRepository;
    private final UserCurrencyRepositoryCustom userCurrencyRepositoryCustom;

    public UserCurrencyService(UserCurrencyRepository userCurrencyRepository, UserCurrencyRepositoryCustom userCurrencyRepositoryCustom) {
        this.userCurrencyRepository = userCurrencyRepository;
        this.userCurrencyRepositoryCustom = userCurrencyRepositoryCustom;
    }

    public UserCurrencyModel getUserCurrencyByUserId(BigInteger userId) {
        return userCurrencyRepository.getById(userId);
    }
}
