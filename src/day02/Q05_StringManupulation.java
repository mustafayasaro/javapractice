package day02;

import java.util.Scanner;

public class Q05_StringManupulation {

    public static void main(String[] args) {

        /*
         * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
         *
         * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
         *         Output : Cesaret insana sinirlarini ogretir.
         *
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Cumle olusturmak icin lutfen dort kelime giriniz");
        System.out.println("Birinci kelime : ");
        String kelime1 = scan.next();
        kelime1 = kelime1.substring(0,1).toUpperCase() + kelime1.substring(1).toLowerCase();

        System.out.println("Ikinci kelime : ");
        String kelime2 = scan.next().toLowerCase();

        System.out.println("Ucuncu kelime : ");
        String kelime3 = scan.next().toLowerCase();

        System.out.println("Dorduncu kelime : ");
        String kelime4 = scan.next().toLowerCase();

        System.out.println(kelime1 + " " + kelime2 + " " + kelime3 + " " + kelime4 + ".");

    }
}
