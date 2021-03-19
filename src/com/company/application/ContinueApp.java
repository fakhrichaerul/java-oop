package com.company.application;

public class ContinueApp {
    public static void main(String[] args) {
        
        int counter = 20;

        for (int i = 1; i <= counter; i++) {
            if(i % 2 == 0 && i > 1) {
                System.out.println("Perulangan Genap");
                continue;
            }
            System.out.println("Perulangan Ganjil " + i);
        }
    }
}
