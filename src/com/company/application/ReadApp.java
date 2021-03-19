package com.company.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadApp {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("README.md"))) {

            while (true) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }

        } catch (Throwable throwable) {
            System.out.println("Error membaca file " + throwable.getMessage());
        }

        // Cara manual
        /*finally {
            if (reader != null) {
                try {
                    reader.close();
                    System.out.println("Sukses menutup");
                } catch (IOException e) {
                    System.out.println("Error menutup resource " + e.getMessage());
                }

            }*/
    }

}
