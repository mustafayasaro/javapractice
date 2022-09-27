package day04;

import java.util.Scanner;

public class Q04_ForLoop {

    public static void main(String[] args) {

        /*
        Kullanicidan bir harf girmesini isteyiniz. Girilen harf sesli ise sesli oldugunu
        degilse sessiz oldugunu ekrana yazdirin. Girdigi deger harf degilse
        ya da 1 karakterden fazla ise hata mesaji verin. (Test girilen harf buyuk ya da kucuklugune duyarlidir)
        Sesli harfler : a,e,u,i,o

        Test data:
        a
        beklenen cikti:
        a sesli harftir

        Test data:
        d
        beklenen cikti:
        adsessiz  harftir

        Test data:
        %
        beklenen cikti:
        yanlis karakter girdiniz
 */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        String harf = scan.nextLine().toLowerCase();

        String sesli = "aeuio";
        String sessiz = "qwrtypsdfghjklzxcvbnm";

        if (harf.length() == 1) {
            for (int i = 0; i < sesli.length(); i++) {
                if (sesli.contains(harf)) {
                    System.out.println(harf + " sesli harftir");
                    break;
                } else if (sessiz.contains(harf)) {
                    System.out.println(harf + " sessiz harftir");
                    break;
                } else {
                    System.out.println("Yanlis karakter girdiniz");
                    break;
                }
            }
        } else {
            System.out.println("Hata = birden fazla karakter girdiniz");
        }


        // char harf = scan.next().charAt(0);

        // if ((harf >= 'A' && harf <= 'Z') || (harf >= 'a' && harf <= 'z')) {
        //     if (harf == 'a' || harf == 'e' || harf == 'u' || harf == 'i' || harf == 'o' || harf == 'A'
        //             || harf == 'E' || harf == 'U' || harf == 'I' || harf == 'O') {
        //         System.out.println(harf + " sesli harftir");
        //     } else {
        //         System.out.println(harf + " sessiz harftir");
        //     }
        // } else {
        //     System.out.println("yanlis karakter girdiniz");
        // }


    }
}
