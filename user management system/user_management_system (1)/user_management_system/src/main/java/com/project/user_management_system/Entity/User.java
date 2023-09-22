package com.project.user_management_system.Entity;


public class User {

    private Integer userId;
    private String name;

    private String userName;

    private  String userContactNo;

    private String address;

    public User(Integer userId, String name, String userName, String userContactNo, String address) {
        this.userId = userId;
        this.name = name;
        this.userName = userName;
        this.userContactNo = userContactNo;
        this.address = address;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserContactNo() {
        return userContactNo;
    }

    public void setUserContactNo(String userContactNo) {
        this.userContactNo = userContactNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}