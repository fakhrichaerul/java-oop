package com.company.data;

import com.company.annotation.Fancy;

@Fancy(name = "Car", tags = {"Application Java"})
public enum Level {

    STANDARD("Standard Level"),
    PREMIUM("Premium Level"),
    VIP("VIP Level");

    private String description;

    Level(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }


}
