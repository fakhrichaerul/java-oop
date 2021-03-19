package com.company.application;

import static com.company.data.Application.PROCESSORS;
import static com.company.data.Constant.*;
import com.company.data.Country;
import com.company.util.MathUtil;

public class StaticApp {
    public static void main(String[] args) {
        System.out.println(APPLICATION);
        System.out.println(VERSION);

        System.out.println(
                MathUtil.sum(1, 1, 1, 1)

        );

        Country.City city = new Country.City();
        city.setName("Bandung");

        System.out.println(city.getName() );

        System.out.println(PROCESSORS);
    }
}
