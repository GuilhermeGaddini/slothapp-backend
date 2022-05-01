package com.fatec.slothapp.domain.repositories;

import java.math.BigInteger;

public interface UserCurrencyRepositoryCustom {

    BigInteger findUserCurrencyByUserId(BigInteger userId);
}
