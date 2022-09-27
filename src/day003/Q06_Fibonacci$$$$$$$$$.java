package day003;

import java.util.Scanner;

public class Q06_Fibonacci$$$$$$$$$ {

    /*
     Kullanicidan alinan bir tamsayi kadar(47 den kucuk) FIBONACCI dizisi olusturun.
       0-1-1-2-3-5-8-13-21-34....
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("47'den kucuk pozitif bir tamsayi giriniz");
        int sayi = scan.nextInt();
       // fibonacci(sayi);

        farkli(sayi);
    }

    public static void farkli(int sayi) {
        int sayi1 = 0;
        int sayi2 = 1;
        int fibon = 0;

        for (int i = 2; i <= sayi; i++) {
            fibon = (i - 1) + (i - 2);
            System.out.print(fibon + " ");
            fibon += (i - 1) + (i - 2);

        }

    }

    public static void fibonacci(int sayi) {

        //   int sayi1 = 0;
        //   int sayi2 = 1;
        //   int sayi3 = 0;

        //   System.out.print(sayi1 + " ");
        //   System.out.print(sayi2 + " ");


        //   if (sayi < 47 || sayi <= 0) {
        //       for (int i = 2; i <= sayi; i++) {  //  ilk iki indexi biz dahaa once yazdik burada ise 2, indexten basslayacagiz
        //           sayi3 = sayi1 + sayi2;
        //           System.out.print(sayi3 + " ");
        //           sayi1 = sayi2;
        //           sayi2 = sayi3;
        //       }
        //   } else {
        //       System.out.println("Lutfen 47,den kucuk bir tamsayi giriniz");
        //   }


    }

}
