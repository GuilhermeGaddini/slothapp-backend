package com.fatec.slothapp.domain.services;

import com.fatec.slothapp.api.models.MembersScoreModel;
import com.fatec.slothapp.domain.repositories.MembersScoreRepository;
import com.fatec.slothapp.domain.repositories.MembersScoreRepositoryCustom;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class MembersScoreService {

    private final MembersScoreRepository membersScoreRepository;
    private final MembersScoreRepositoryCustom membersScoreRepositoryCustom;

    public MembersScoreService(MembersScoreRepository membersScoreRepository, MembersScoreRepositoryCustom membersScoreRepositoryCustom) {
        this.membersScoreRepository = membersScoreRepository;
        this.membersScoreRepositoryCustom = membersScoreRepositoryCustom;
    }

    /* public BigInteger getUserXpByUserId(BigInteger userId) {
        return membersScoreRepositoryCustom.findUserXpByUserId(userId);
    }

    public int getUserLvlByUserId(BigInteger userId) {
        return membersScoreRepositoryCustom.findUserLvlByUserId(userId);
    }

    public int getUserXpTimeByUserId(BigInteger userId) {
        return membersScoreRepositoryCustom.findUserXpTimeByUserId(userId);
    }

    public BigInteger getUserScorePointsByUserId(BigInteger userId){
        return membersScoreRepositoryCustom.findScorePointByUserId(userId);
    }

    public BigInteger getUserRepTimeByUserId(BigInteger userId){
        return membersScoreRepositoryCustom.findRepTimeByUserId(userId);
    }

     public MembersScoreModel getMemberScoreByUserId(BigInteger userId){
        BigInteger userXp = getUserXpByUserId(userId);
        int userLvl = getUserLvlByUserId(userId);
        int userXpTime = getUserXpTimeByUserId(userId);
        BigInteger scorePoints = getUserScorePointsByUserId(userId);
        BigInteger repTime = getUserRepTimeByUserId(userId);
        MembersScoreModel memberScore = new MembersScoreModel(userId, userXp, userLvl, userXpTime, scorePoints, repTime);
        return memberScore;
    }*/

    public MembersScoreModel getMemberScoreByUserId(BigInteger userId){
        return membersScoreRepositoryCustom.findByUserId(userId);
    }
}
