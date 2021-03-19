package com.company.application;

public class ForEach {

    public static void main(String[] args) {
        String[] names = {"Fakhri", "Chaerul", "Insan",
                "Sedang", "Belajar", "Java"
        };

        // For Biasa
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("---For Each---");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
