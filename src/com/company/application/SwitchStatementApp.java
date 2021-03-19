package com.company.application;

public class SwitchStatementApp {
    public static void main(String[] args) {
        var nilai = "A";

        switch (nilai) {
            case "A":
                System.out.println("Wow, Anda lulus dengan baik");
                break;
            case "B":
            case"C":
                System.out.println("Nilai Anda cukup baik");
                break;
            case "D":
                System.out.println("Anda tidak lulus");
                break;
            default:
                System.out.println("Mungkin anda salah jurusan");
        }

        ///Hanya berfungsi di java versi 14
//        switch (nilai) {
//            case "A" -> System.out.println("Wow, Anda lulus dengan baik");
//            case "B","C" -> System.out.println("Nilai Anda cukup baik");
//            case "D" -> System.out.println("Anda tidak lulus");
//            default -> {
//                System.out.println("Mungkin anda salah jurusan");
//                System.out.println("Atau coba lagi tahun depan");
//            }
//        }
    }
}
