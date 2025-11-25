package com.ksz.BookieZ.dto;

public class LoginInfo {
    private String id;
    private String userName;
    private String password;

    public LoginInfo() {
        userName = "admin";
        password = "123";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

