package com.mft.entity;

public class Admin {
    private String adminID;
    private String adminPW;
    private String adminName;
    private String adminTel;

    public void setAdminID(String adminID) {
        this.adminID = adminID;
    }

    public String getAdminID() {
        return adminID;
    }

    public void setAdminPW(String adminPW) {
        this.adminPW = adminPW;
    }

    public String getAdminPW() {
        return adminPW;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminTel(String adminTel) {
        this.adminTel = adminTel;
    }

    public String getAdminTel() {
        return adminTel;
    }
}
