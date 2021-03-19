package com.company.data;

public class Application {

    public static final int PROCESSORS;

    static {
        System.out.println("Mengakses class aplikasi");
        PROCESSORS = Runtime.getRuntime().availableProcessors();
    }
}
