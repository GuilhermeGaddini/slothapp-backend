package com.fatec.slothapp.api.models;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "registereditems")
public class RegisteredItemsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger registeredItemsId;
    private String itemName;
    private String imageName;
    private String itemType;
    private int itemPrice;
    private BigInteger messageRef;
    private String reactionRef;

    public RegisteredItemsModel(BigInteger registeredItemsId, String itemName, String imageName, String itemType, int itemPrice, BigInteger messageRef, String reactionRef) {
        this.registeredItemsId = registeredItemsId;
        this.itemName = itemName;
        this.imageName = imageName;
        this.itemType = itemType;
        this.itemPrice = itemPrice;
        this.messageRef = messageRef;
        this.reactionRef = reactionRef;
    }

    public RegisteredItemsModel(){}

    public BigInteger getRegisteredItemsId() {
        return registeredItemsId;
    }

    public void setRegisteredItemsId(BigInteger registeredItemsId) {
        this.registeredItemsId = registeredItemsId;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public BigInteger getMessageRef() {
        return messageRef;
    }

    public void setMessageRef(BigInteger messageRef) {
        this.messageRef = messageRef;
    }

    public String getReactionRef() {
        return reactionRef;
    }

    public void setReactionRef(String reactionRef) {
        this.reactionRef = reactionRef;
    }

    @Override
    public String toString() {
        return "registeredItemsModel{" +
                "imageName='" + imageName + '\'' +
                ", itemType='" + itemType + '\'' +
                ", itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                ", messageRef=" + messageRef +
                ", reactionRef='" + reactionRef + '\'' +
                '}';
    }
}
