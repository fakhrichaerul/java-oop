package com.company.application;

public class EqualsApp {
    public static void main(String[] args) {

        String first = "Fakhri";
        first = first + " " + "Chaerul";
        System.out.println(first);

        String second = "Fakhri Chaerul";
        System.out.println(second);

        System.out.println(first == second); // Membandingkan data object yang sama
        System.out.println(first.equals(second)); // Membandingkan isi konten yang sama

        String third = "Fakhri Chaerul";

        System.out.println(second == third); // Membandingkan data object yang sama setelah memori data dioptimize
        System.out.println(second.equals(third)); // Membanding isi konten yang sama
    }
}
