package day09_javapractice.okul_proje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Giris {

    /*
    Ogretmen bilgilerini kullanicidan aliniz
    aldiginiz bilgilereden object ureterek yeni
    ogretmenler olusturun ve bilgileri yazdirin
     */
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Okulumuzaa hosgeldiniz");




        System.out.println("isim giriniz : ");
        String isim = scan.nextLine();

        System.out.println("soyisim giriniz : ");
        String soyisim = scan.nextLine();

        System.out.println("yasinizi giriniz : ");
        int yas = scan.nextInt();

        scan.nextLine(); // dummy : hayalet kod

        System.out.println("bransinizi giriniz : ");
        String brans = scan.nextLine();


        System.out.println("telefon no giriniz : ");
        String tel = scan.nextLine();

        OgretmenBilgileri adayOgretmen = new OgretmenBilgileri(isim, soyisim, yas, brans, tel);

        List<OgretmenBilgileri> ogretmenList = new ArrayList<>();
        // ogretmenList verilerini  OgretmenBilgileri datab tipine gore store ederiz

        ogretmenList.add(adayOgretmen);

        System.out.println("ogretmenList = " + ogretmenList);


    }
}
