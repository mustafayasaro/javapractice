package day02;

import java.util.Scanner;

public class Q09_SttringManupulation {
    public static void main(String[] args) {

        // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen adinizi ve soyadinizi giriniz");
        String isim = scan.nextLine();
        String soyisim = scan.nextLine();

        if (isim.length() > soyisim.length()) {
            System.out.println("Isminizin karakter sayisi soyisminizin karakter sayisindan daha uzun");
        } else if (isim.length() < soyisim.length()) {
            System.out.println("Soyisminizin karakter sayisi isminizin karakter sayisindan daha uzun");
        } else {
            System.out.println("Isminizin ve soyisminizin karakter sayilari esit");
        }

    }
}
