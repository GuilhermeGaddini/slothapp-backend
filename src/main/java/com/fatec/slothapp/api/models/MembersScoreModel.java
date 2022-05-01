package com.fatec.slothapp.api.models;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "membersscore")
public class MembersScoreModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger userId;
    private BigInteger userXp;
    private int userLvl;
    private int userXpTime;
    private BigInteger scorePoints;
    private BigInteger repTime;

    public MembersScoreModel(BigInteger userId, BigInteger userXp, int userLvl, int userXpTime, BigInteger scorePoints, BigInteger repTime) {
        this.userId = userId;
        this.userXp = userXp;
        this.userLvl = userLvl;
        this.userXpTime = userXpTime;
        this.scorePoints = scorePoints;
        this.repTime = repTime;
    }

    public MembersScoreModel(){}

    public BigInteger getUserId() {
        return userId;
    }

    public void setUserId(BigInteger userId) {
        this.userId = userId;
    }

    public BigInteger getUserXp() {
        return userXp;
    }

    public void setUserXp(BigInteger userXp) {
        this.userXp = userXp;
    }

    public int getUserLvl() {
        return userLvl;
    }

    public void setUserLvl(int userLvl) {
        this.userLvl = userLvl;
    }

    public int getUserXpTime() {
        return userXpTime;
    }

    public void setUserXpTime(int userXpTime) {
        this.userXpTime = userXpTime;
    }

    public BigInteger getScorePoints() {
        return scorePoints;
    }

    public void setScorePoints(BigInteger scorePoints) {
        this.scorePoints = scorePoints;
    }

    public BigInteger getRepTime() {
        return repTime;
    }

    public void setRepTime(BigInteger repTime) {
        this.repTime = repTime;
    }

    @Override
    public String toString() {
        return "membersScoreModel{" +
                "userId=" + userId +
                ", userXp=" + userXp +
                ", userLvl=" + userLvl +
                ", userXpTime=" + userXpTime +
                ", scorePoints=" + scorePoints +
                ", repTime=" + repTime +
                '}';
    }
}
