package com.mft.entity;

public class Order {
    private String orderID;
    private String userID;
    private String goodID;
    private int quantity;
    private int status;

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserID() {
        return userID;
    }

    public void setGoodID(String goodID) {
        this.goodID = goodID;
    }

    public String getGoodID() {
        return goodID;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

}
