package com.company.application;

import com.company.data.HelloWorld;

public class HelloWorldApp {
    public static void main(String[] args) {

        HelloWorld english = new HelloWorld() {
            @Override
            public void sayHello() {
                System.out.println("Hello");
            }

            @Override
            public void sayHello(String name) {
                System.out.println("Hello " + name);
            }
        };

        HelloWorld indonesia = new HelloWorld() {
            @Override
            public void sayHello() {
                System.out.println("Halo");
            }

            @Override
            public void sayHello(String name) {
                System.out.println("Halo " + name);
            }
        };

        english.sayHello();
        english.sayHello("Fakhri");
        indonesia.sayHello();
        indonesia.sayHello("Budi");

        //error karna memanggil sout dalam sout sehingga output hanya memanggil package hashcode
//      System.out.println(english);

    }
}
