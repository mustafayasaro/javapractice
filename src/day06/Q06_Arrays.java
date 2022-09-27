package day06;

import java.util.Scanner;

public class Q06_Arrays {

    public static void main(String[] args) {

               /*
               kullanıcının girdigi bir array'in en buyuk elemani ile
               en kucuk elemanının  farkını bulan bir method create ediniz.
              */

        farkMethodu();

    }

    private static void farkMethodu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen arrayin uzunlugunu giriniz");
        int uzunluk = scan.nextInt();

        int[] sayilar = new int[uzunluk];

        for (int i = 0; i < uzunluk; i++) {
            System.out.println("Lutfen " + i + ". indexi giriniz");
            sayilar[i] = scan.nextInt();
        }
        int min = sayilar[0];
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] < min) {
                min = sayilar[i];
            }
        }

        int max = sayilar[0];
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] > max) {
                max = sayilar[i];
            }
        }
        System.out.println("Girdiginiz array'in en buyuk elemani : " + max);
        System.out.println("Girdiginiz array'in en kucuk elemani : " + min);
        System.out.println("Girdiginiz array'in en buyuk ve en kucuk elemanlarrin farki : " +( max - min));

        //odeev: bu soruyu Math class'ini kullanarak cozunuz

    }
}
