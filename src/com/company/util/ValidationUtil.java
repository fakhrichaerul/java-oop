package com.company.util;

import com.company.annotation.NotBlank;
import com.company.application.LoginRequest;
import com.company.error.BlankException;
import com.company.error.ValidationException;

import java.lang.reflect.Field;

public class ValidationUtil {

    public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException {
        if (loginRequest.getUsername() == null) {
            throw new NullPointerException("Username is null");
        } else if (loginRequest.getUsername().isBlank()) {
            throw new ValidationException("Username is blank");
        } else if (loginRequest.getPassword() == null) {
            throw new NullPointerException("password is null");
        } else if (loginRequest.getPassword().isBlank()) {
            throw new ValidationException("password is blank");
        }
    }

    public static void validateRunTime(LoginRequest loginRequest) {
        if (loginRequest.getUsername() == null) {
            throw new NullPointerException("Username is null");
        } else if (loginRequest.getUsername().isBlank()) {
            throw new BlankException("Username is blank");
        } else if (loginRequest.getPassword() == null) {
            throw new NullPointerException("password is null");
        } else if (loginRequest.getPassword().isBlank()) {
            throw new BlankException("password is blank");
        }
    }

    public static void validationReflection(Object object) {
        Class aClass = object.getClass();
        Field[] fields = aClass.getDeclaredFields();

        for(var field : fields) {
            field.setAccessible(true);

            if(field.getAnnotation(NotBlank.class) != null) {
                //validated
                try {
                    String value = (String) field.get(object);

                    if(value == null || value.isBlank()) {
                        throw new BlankException("Field " + field.getName() + " is blank");
                    }
                } catch (IllegalAccessException exception) {
                    System.out.println("Tidak bisa mengakses field " + field.getName());
                }
            }
        }
    }
}