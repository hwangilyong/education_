package com.company.day41.member.entity;

public class MemberVO {
    private String userId;
    private String userPassword;
    private String userName;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean setCheckPassword(String userPassword){
        return this.userPassword.equals(userPassword);
    }
}
