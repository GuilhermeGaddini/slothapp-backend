package com.fatec.slothapp.api.models;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "useritems", uniqueConstraints={
        @UniqueConstraint(columnNames = {"user_items_id", "item_id"})
})
public class UserItemsModel {

    private BigInteger itemId;
    private BigInteger userId;
    private String itemName;
    private String enable;
    private String itemType;
    private String imageName;

    public UserItemsModel(){}

    public UserItemsModel(BigInteger itemId, BigInteger userId, String itemName, String enable, String itemType, String imageName) {
        this.itemId = itemId;
        this.userId = userId;
        this.itemName = itemName;
        this.enable = enable;
        this.itemType = itemType;
        this.imageName = imageName;
    }

    public BigInteger getItemId() {
        return itemId;
    }

    public void setItemId(BigInteger itemId) {
        this.itemId = itemId;
    }

    public BigInteger getUserId() {
        return userId;
    }

    public void setUserId(BigInteger userId) {
        this.userId = userId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public String toString() {
        return "UserItemsModel{" +
                "itemId=" + itemId +
                ", userId=" + userId +
                ", itemName='" + itemName + '\'' +
                ", enable='" + enable + '\'' +
                ", itemType='" + itemType + '\'' +
                ", imageName='" + imageName + '\'' +
                '}';
    }
}
