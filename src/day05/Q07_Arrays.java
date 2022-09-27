package day05;

public class Q07_Arrays {

    public static void main(String[] args) {
        /*
         verilen Arrayde toplamlari istenen degere esit olan sayi ciftlerini //
         yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1}; int
         istenenToplam=9;
        */

        int[] sayilar = {5, 7, -6, 4, 2, 15, 3, 8, 1};
        int istenenToplam = 9;


        arrMethod(sayilar,istenenToplam);


    }

    private static void arrMethod(int[] sayilar, int istenenToplam) {

        for (int i = 0; i < sayilar.length; i++) {
            for (int j = i+1; j < sayilar.length; j++) {
                if (sayilar[i] + sayilar[j] == 9) {
                    System.out.println(sayilar[i] + " ve " + sayilar[j] + " toplam : " + istenenToplam);
                }
            }
        }

        /*
        inner loop  j = i+1  oldugunda
        inner loop  j = i    oldugunda
                        5 ve 4 toplam : 9
                        7 ve 2 toplam : 9
                        -6 ve 15 toplam : 9
                         8 ve 1 toplam : 9

         inner loop  j = 0  oldugunda
                          5 ve 4 toplam : 9
                          7 ve 2 toplam : 9
                          -6 ve 15 toplam : 9
                          4 ve 5 toplam : 9
                          2 ve 7 toplam : 9
                          15 ve -6 toplam : 9
                          8 ve 1 toplam : 9
                          1 ve 8 toplam : 9




         */

    }
}
