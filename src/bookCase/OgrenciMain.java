package bookCase;

import java.util.Scanner;

public class OgrenciMain {

    public static void main(String[] args) {

        String isim = "Ahmet ";
        String soyIsim = "Var";
        String tel = "+1 555 333 77 88";
        String ogrenciNo = "20223322";

        isimDegistir(isim,soyIsim, tel, ogrenciNo);

        System.out.println("isim : " + isim + "\n soyisim : " + soyIsim + "\ntel " + tel + "\nOgrenci no : " + ogrenciNo);

        soyIsimDegistir(soyIsim);
        System.out.println("isim : " + isim + "\n soyisim : " + soyIsim + "\ntel " + tel + "\nOgrenci no : " + ogrenciNo);


    }

    private static void soyIsimDegistir(String soyIsim) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen soyisminizi guncelleyiniz : ");
        System.out.println("soyisim : " + soyIsim);
    }

    private static void isimDegistir(String isim,String soyIsim, String tel, String ogrenciNo) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminiz giriniz : ");
        isim = scan.nextLine();
        System.out.println("Lutfen soyisminizi giriniz : ");
        soyIsim = scan.nextLine();
        System.out.println("Lutfen telefon numaranizi girniz : ");
        tel = scan.nextLine();
        System.out.println("Lutfen ogrenci numaranizi girinz : ");
        ogrenciNo = scan.nextLine();
        System.out.println("isimDegistir() method'u");
        System.out.println("isim : " + isim + "\n soyisim : " + soyIsim + "\ntel " + tel + "\nOgrenci no : " + ogrenciNo);
    }


}
