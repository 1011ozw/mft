package com.mft.entity;

public class Store {
    private String storeID;
    private String storeName;
    private String supplierID;

    public void setStoreID(String storeID) {
        this.storeID = storeID;
    }

    public String getStoreID() {
        return storeID;
    }

    public void setSupplierID(String supplierID) {
        this.supplierID = supplierID;
    }

    public String getSupplierID() {
        return supplierID;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreName() {
        return storeName;
    }

}
