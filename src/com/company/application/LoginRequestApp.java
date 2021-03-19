package com.company.application;

public class LoginRequestApp {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest("fakhri", "rahasia");

        System.out.println(loginRequest.getUsername());
        System.out.println(loginRequest.getPassword());
        System.out.println(loginRequest);

        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("fakhri"));
        System.out.println(new LoginRequest("fakhri", "rahasia"));
    }
}
