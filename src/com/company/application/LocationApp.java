package com.company.application;

import com.company.data.City;
import com.company.data.Location;

public class LocationApp {
    public static void main(String[] args) {

        //var location = new Location(); // error
        var city = new City();
        city.name = "Bandung";

        System.out.println(city.name);
    }
}
