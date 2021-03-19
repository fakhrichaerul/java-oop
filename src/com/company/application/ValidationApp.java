package com.company.application;

import com.company.annotation.Fancy;
import com.company.error.ValidationException;
import com.company.util.ValidationUtil;

public class ValidationApp {

    @Fancy(name = "Car", tags = {"Application Java"})
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest("fakhri", "rahasia");

        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data valid");
        } catch (ValidationException | NullPointerException exception) {
            System.out.println("Data tidak valid : " + exception.getMessage());
        } finally {
            System.out.println("Selalu dieksekusi");
        }

        LoginRequest loginRequest1 = new LoginRequest(null, null);
        ValidationUtil.validateRunTime(loginRequest1);
        System.out.println("Sukses");

    }
}
