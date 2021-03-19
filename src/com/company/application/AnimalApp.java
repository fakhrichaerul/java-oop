package com.company.application;

import com.company.annotation.Fancy;
import com.company.data.Animal;
import com.company.data.Cat;

@Fancy(name = "Animal App", tags = {"Application", "Java"})
public class AnimalApp {
    public static void main(String[] args) {

        Animal animal = new Cat();
        animal.name = "Puss";
        animal.run();

    }
}
