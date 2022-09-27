package day05;

import java.util.Scanner;

public class Q01_NestedForLoop {

    public static void main(String[] args) {

        /*
        Girilen sayinin basamaklarindaki rakamlari toplamini bulunuz
         */

        Scanner scan = new Scanner(System.in);
        int sayi = scan.nextInt();

        bamakToplama(sayi);

        System.out.println(bamakToplama(sayi));
    }

    private static int bamakToplama(int sayi) {
        int toplam = 0;
        while (sayi != 0) { // sayi sifirdan farkli oldugu surece devam et
            toplam += sayi % 10;
            sayi /= 10;
        }

        return toplam;
    }
}
