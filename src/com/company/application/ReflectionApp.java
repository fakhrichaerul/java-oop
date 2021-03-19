package com.company.application;

import com.company.data.CreateUserRequest;
import com.company.util.ValidationUtil;

public class ReflectionApp {
    public static void main(String[] args) {

        CreateUserRequest request = new CreateUserRequest();
        request.setUsername("Fakhri");
        request.setPassword("rahasia");

        ValidationUtil.validationReflection(request);

    }
}
