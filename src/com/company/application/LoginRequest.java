package com.company.application;

import com.sun.security.jgss.GSSUtil;

public class LoginRequest {

    //Cara dengan class record
//    public LoginRequest {
//        System.out.println("Membuat object LoginRequest");
//    }
//
//    public LoginRequest(String username) {
//        this(username, "");
//    }
//
//    public LoginRequest() {
//        this("", "");
//    }


    private String username;
    private String password;

    public LoginRequest(String username, String password) {
        this.username = username;
        this.password = password;

        System.out.println("Membuat object login request");
    }

    public LoginRequest(String username) {
        this.username = username;
        this.password = "";
    }

    public LoginRequest() {
        this.username = "";
        this.password = "";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginRequest{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
