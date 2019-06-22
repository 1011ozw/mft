package com.mft.entity;

public class Depository {
    private String depositoryID;
    private String d_address;
    private String d_goodID;
    private int d_quantity;

    public void setDepositoryID(String depositoryID) {
        this.depositoryID = depositoryID;
    }

    public String getDepositoryID() {
        return depositoryID;
    }

    public void setD_address(String d_address) {
        this.d_address = d_address;
    }

    public String getD_address() {
        return d_address;
    }

    public void setD_goodID(String d_goodID) {
        this.d_goodID = d_goodID;
    }

    public String getD_goodID() {
        return d_goodID;
    }

    public void setD_quantity(int d_quantity) {
        this.d_quantity = d_quantity;
    }

    public int getD_quantity() {
        return d_quantity;
    }
}
