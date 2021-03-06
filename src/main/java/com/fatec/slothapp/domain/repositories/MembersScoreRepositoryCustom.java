package com.fatec.slothapp.domain.repositories;

import com.fatec.slothapp.api.models.MembersScoreModel;

import java.math.BigInteger;

public interface MembersScoreRepositoryCustom {
    BigInteger findUserXpByUserId(BigInteger userId);

    int findUserLvlByUserId(BigInteger userId);

    int findUserXpTimeByUserId(BigInteger userId);

    BigInteger findScorePointByUserId(BigInteger userId);

    BigInteger findRepTimeByUserId(BigInteger userId);

    MembersScoreModel findByUserId(BigInteger userId);
}
