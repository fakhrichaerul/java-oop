package com.company.application;


import com.company.data.Product;


public class Application {
    public static void main(String[] args) {

        Product product = new Product("Mac Air", 2000);

        System.out.println(product.name);
        System.out.println(product.price);

    }
}
