package day02;

import java.util.Scanner;

public class Q02_StringManupulation {
    public static void main(String[] args) {

        //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi
        // String manipulation method kullanarak birlestiriniz.
        //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("String1 : ");
        String str1 = scan.nextLine();

        System.out.println("String2 : ");
        String str2 = scan.nextLine();

        /*
               1. YOL
         */

        System.out.println(str1 + " " + str2);

        /*
               2. YOL
         */

        System.out.println(str1.concat(" " + str2));


        String str1_0indexteSonrasi = str1.substring(1);
        String str2_0indexteSonrasi = str2.substring(1);

        System.out.println("Manupulation'dan sonraki hali : " + str1_0indexteSonrasi + "" + str2_0indexteSonrasi);


    }
}
