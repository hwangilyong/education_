package com.company.homework3Member.member.entity;

public class MemberVO {
    private String userId;
    private String userPassword;
    private String confirmPassword;
    private String userName;
    private String userEmail;
    private String[] hobby = {};
    private String specialty;
    private String phoneNum;
    private int userBirth;
    private String userSex;

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

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String[] getListHobby(){
        return hobby.clone();
    }

    public void setHobby(String hobby) {
        String[] buffer = new String[this.hobby.length + 1];
        for(int index = 0; index < this.hobby.length; index++){
            buffer[index] = this.hobby[index];
        }

        buffer[this.hobby.length] = hobby;

        this.hobby = buffer;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getUserBirth() {
        return userBirth;
    }

    public void setUserBirth(int userBirth) {
        this.userBirth = userBirth;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public boolean passwordCheck(){
        return userPassword.equals(confirmPassword);
    }
    public boolean loginPasswordCheck(String userPassword){return this.userPassword.equals(userPassword);}

    public void ppp(){
        System.out.println("--[유저 정보]--");
        System.out.println("[ID : " + userId + "]");
        System.out.println("[이름 : " + userName + "]");
        System.out.println("[EMAIL : " + userEmail + "]");
        System.out.println("[취미 : " + getListHobby()[0] + "]");
        System.out.println("[특기 : " + specialty + "]");
        System.out.println("[전화번호 : " + phoneNum + "]");
        System.out.println("[생일 : " + userBirth + "]");
        System.out.println("[성별 : " + userSex + "]");
        System.out.println("--------------");
    }
}
