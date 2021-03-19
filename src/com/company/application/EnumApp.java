package com.company.application;

import com.company.annotation.Fancy;
import com.company.data.Customer;
import com.company.data.Level;

public class EnumApp {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setName("Fakhri");
        customer.setLevel(Level.STANDARD);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel().getDescription());

        String levelName = Level.VIP.name();
        System.out.println(levelName);

        Level level = Level.valueOf("STANDARD");
        System.out.println(level);

        System.out.println("Print Level");
        for (var item : Level.values()) {
            System.out.println(item);
        }

        Level[] levelB = Level.values();
        for (int i = levelB.length - 1; i >= 0; i--) {
            
        }

    }
}
