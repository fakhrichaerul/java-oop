package com.company.application;

import com.company.error.DatabaseError;

import javax.swing.*;

public class DatabaseApp {
    public static void main(String[] args) {

        connectDatabase(null, "rahasia");
        System.out.println("Sukses");

    }

    public static void connectDatabase(String username, String password) {
        if (username == null || password == null) {
            throw new DatabaseError("Tidak bisa konek ke database");
        }
    }
}
