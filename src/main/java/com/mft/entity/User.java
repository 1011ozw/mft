package com.mft.entity;

public class User {
    private String userID;
    private String userPw;
    private String userName;
    private String userTel;
    private String userMail;

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserPw(String userPw) {
        this.userPw = userPw;
    }

    public String getUserPw() {
        return userPw;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public String getUserMail() {
        return userMail;
    }
}
