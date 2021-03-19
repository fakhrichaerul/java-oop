package com.company.application;

import com.company.data.Level;

public class ForLoopApp {
    public static void main(String[] args) {

        for(var counter= 1;counter <= 10;counter++) {
            System.out.println("Perulangan ke " + counter);
        }

        for(var counterR=10; counterR >= 0; counterR--) {
            System.out.println(counterR);
        }

        for (var item :Level.values()) {
            System.out.println(item);
        }


    }
}
