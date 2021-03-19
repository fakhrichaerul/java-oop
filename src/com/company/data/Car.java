package com.company.data;

import com.company.annotation.Fancy;

@Fancy(name = "Car", tags = {"Application Java"})
public interface Car extends HasBrand, IsMaintenance{

    void drive();

    int getTier();

    default boolean isBig(){
        return false;
    }

}
