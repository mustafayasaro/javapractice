package day05;

import java.util.Scanner;

public class Q03_DWhileLoop {

    public static void main(String[] args) {

        /*
         Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
         ve x girildiğinde ise "Program bitti" yazan programı yazınız.
        */

        Scanner scan = new Scanner(System.in);

        String okunan = "";
        do {
            System.out.print("Lutfen bir sayi giriniz :");
            okunan = scan.next();
            System.out.println("Program calisiyor");
        }while(!okunan.equalsIgnoreCase("x"));

        System.out.println("Program  bitti");

    }
}
