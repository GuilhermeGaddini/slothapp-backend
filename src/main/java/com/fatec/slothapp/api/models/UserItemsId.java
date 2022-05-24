package com.fatec.slothapp.api.models;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

public class UserItemsId implements Serializable {

    private BigInteger userId;
    private BigInteger itemId;

    public BigInteger getUserId() {
        return userId;
    }

    public void setUserId(BigInteger userId) {
        this.userId = userId;
    }

    public BigInteger getItemId() {
        return itemId;
    }

    public void setItemId(BigInteger itemId) {
        this.itemId = itemId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserItemsId that = (UserItemsId) o;
        return Objects.equals(userId, that.userId) && Objects.equals(itemId, that.itemId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, itemId);
    }

    @Override
    public String toString() {
        return "UserItemsId{" +
                "userId=" + userId +
                ", itemId=" + itemId +
                '}';
    }
}
