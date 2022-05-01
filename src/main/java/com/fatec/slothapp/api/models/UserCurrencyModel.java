package com.fatec.slothapp.api.models;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "usercurrency")
public class UserCurrencyModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger userId;
    private BigInteger userMoney;
    private BigInteger lastPurchaseTs;
    private BigInteger userClasses;
    private BigInteger userClassReward;
    private BigInteger userHosted;
    private BigInteger userLotto;

    public UserCurrencyModel(BigInteger userId, BigInteger userMoney, BigInteger lastPurchaseTs, BigInteger userClasses, BigInteger userClassReward, BigInteger userHosted, BigInteger userLotto) {
        this.userId = userId;
        this.userMoney = userMoney;
        this.lastPurchaseTs = lastPurchaseTs;
        this.userClasses = userClasses;
        this.userClassReward = userClassReward;
        this.userHosted = userHosted;
        this.userLotto = userLotto;
    }

    public UserCurrencyModel(){}

    public BigInteger getUserId() {
        return userId;
    }

    public void setUserId(BigInteger userId) {
        this.userId = userId;
    }

    public BigInteger getUserMoney() {
        return userMoney;
    }

    public void setUserMoney(BigInteger userMoney) {
        this.userMoney = userMoney;
    }

    public BigInteger getLastPurchaseTs() {
        return lastPurchaseTs;
    }

    public void setLastPurchaseTs(BigInteger lastPurchaseTs) {
        this.lastPurchaseTs = lastPurchaseTs;
    }

    public BigInteger getUserClasses() {
        return userClasses;
    }

    public void setUserClasses(BigInteger userClasses) {
        this.userClasses = userClasses;
    }

    public BigInteger getUserClassReward() {
        return userClassReward;
    }

    public void setUserClassReward(BigInteger userClassReward) {
        this.userClassReward = userClassReward;
    }

    public BigInteger getUserHosted() {
        return userHosted;
    }

    public void setUserHosted(BigInteger userHosted) {
        this.userHosted = userHosted;
    }

    public BigInteger getUserLotto() {
        return userLotto;
    }

    public void setUserLotto(BigInteger userLotto) {
        this.userLotto = userLotto;
    }

    @Override
    public String toString() {
        return "userCurrencyModel{" +
                "userId=" + userId +
                ", userMoney=" + userMoney +
                ", lastPurchaseTs=" + lastPurchaseTs +
                ", userClasses=" + userClasses +
                ", userClassReward=" + userClassReward +
                ", userHosted=" + userHosted +
                ", userLotto=" + userLotto +
                '}';
    }
}
