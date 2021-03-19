package com.company.application;

import com.company.annotation.Fancy;
import com.company.data.Avanza;
import com.company.data.Car;


public class CarApp {
    public static void main(String[] args) {

        Car car = new Avanza();
        System.out.println(car.getTier());
        System.out.println(car.getBrand());
        car.drive();
    }
}
