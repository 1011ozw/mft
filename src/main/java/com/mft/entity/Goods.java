package com.mft.entity;

public class Goods {
    private String goodID;
    private String goodName;
    private int goodprice;
    private String storeID;

    public void setGoodID(String goodID) {
        this.goodID = goodID;
    }

    public String getGoodID() {
        return goodID;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodprice(int goodprice) {
        this.goodprice = goodprice;
    }

    public int getGoodprice() {
        return goodprice;
    }

    public void setStoreID(String storeID) {
        this.storeID = storeID;
    }

    public String getStoreID() {
        return storeID;
    }
}
