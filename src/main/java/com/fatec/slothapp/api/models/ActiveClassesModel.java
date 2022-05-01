package com.fatec.slothapp.api.models;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "activeclasses")
public class ActiveClassesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger teacherId;
    private BigInteger txtId;
    private BigInteger vcId;
    private String language;
    private String classType;
    private BigInteger vcTimestamp;
    private BigInteger vcTime;
    private BigInteger members;
    private String classDesc;
    private String taughtIn;

    public ActiveClassesModel(BigInteger teacherId, BigInteger txtId, BigInteger vcId, String language, String classType, BigInteger vcTimestamp, BigInteger vcTime, BigInteger members, String classDesc, String taughtIn) {
        this.teacherId = teacherId;
        this.txtId = txtId;
        this.vcId = vcId;
        this.language = language;
        this.classType = classType;
        this.vcTimestamp = vcTimestamp;
        this.vcTime = vcTime;
        this.members = members;
        this.classDesc = classDesc;
        this.taughtIn = taughtIn;
    }

    public ActiveClassesModel(){

    }

    public BigInteger getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(BigInteger teacherId) {
        this.teacherId = teacherId;
    }

    public BigInteger getTxtId() {
        return txtId;
    }

    public void setTxtId(BigInteger txtId) {
        this.txtId = txtId;
    }

    public BigInteger getVcId() {
        return vcId;
    }

    public void setVcId(BigInteger vcId) {
        this.vcId = vcId;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public BigInteger getVcTimestamp() {
        return vcTimestamp;
    }

    public void setVcTimestamp(BigInteger vcTimestamp) {
        this.vcTimestamp = vcTimestamp;
    }

    public BigInteger getVcTime() {
        return vcTime;
    }

    public void setVcTime(BigInteger vcTime) {
        this.vcTime = vcTime;
    }

    public BigInteger getMembers() {
        return members;
    }

    public void setMembers(BigInteger members) {
        this.members = members;
    }

    public String getClassDesc() {
        return classDesc;
    }

    public void setClassDesc(String classDesc) {
        this.classDesc = classDesc;
    }

    public String getTaughtIn() {
        return taughtIn;
    }

    public void setTaughtIn(String taughtIn) {
        this.taughtIn = taughtIn;
    }

    @Override
    public String toString() {
        return "activeClassesModel{" +
                "teacherId=" + teacherId +
                ", txtId=" + txtId +
                ", vcId=" + vcId +
                ", language='" + language + '\'' +
                ", classType='" + classType + '\'' +
                ", vcTimestamp=" + vcTimestamp +
                ", vcTime=" + vcTime +
                ", members=" + members +
                ", classDesc='" + classDesc + '\'' +
                ", taughtIn='" + taughtIn + '\'' +
                '}';
    }
}
