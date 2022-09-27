package day02;

import java.util.Scanner;

public class Q10_StringManupulation {

    public static void main(String[] args) {
         /*
           Problem Tanımı :
           Basit 4 islem yapan bir hesap makinesi kodlayiniz....
           Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
           Kullanicidan iki sayi girmesini isteyiniz.
           Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yapacaginiz islemi  turunu ( /, *, -, +) tuslarina basarak seciniz ");
        String islemTuru = scan.next();
        System.out.println("Lutfen islem yapmak istediginiz birinci sayiyi giriniz");
        int sayi1 = scan.nextInt();

        System.out.println("Lutfen islem yapmak istediginiz ikinci sayiyi giriniz");
        int sayi2 = scan.nextInt();

        if(islemTuru.equals("/")){
            int sonuc = sayi1 / sayi2;
            System.out.println("Islemin sonucu : " + sonuc);
        }else if(islemTuru.equals("*")) {
            int sonuc = sayi1 * sayi2;
            System.out.println("Islemin sonucu : " + sonuc);
        }else if(islemTuru.equals("-")) {
            int sonuc = sayi1 - sayi2;
            System.out.println("Islemin sonucu : " + sonuc);
        }else if(islemTuru.equals("+")) {
            int sonuc = sayi1 + sayi2;
            System.out.println("Islemin sonucu : " + sonuc);
        }







    }
}
