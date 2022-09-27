package day11_okulProjesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {


    static List<Kisi> ogretmenList = new ArrayList<>();
    // kisi tipindeki field'lari depoluyor
    // kisi en parent class oldugu icin hem ogretmen
    // hem de ogrenc variable'larina ulasip depolayabiliriz
    // babayi bagla butun child'lara uasabiliriz
    static List<Kisi> ogrenciList = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static String kisiTuru;

    public static void girisPaneli() {
        System.out.println("====================================");
        System.out.println("ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ");
        System.out.println("====================================");
        System.out.println("1- ÖĞRENCİ İŞLEMLERİ");
        System.out.println("2- ÖĞRETMEN İŞLEMLERİ");
        System.out.println("Q- ÇIKIŞ");


        String secim = scan.next().toUpperCase();
        // kullanici kucuk harf girse bile buyuk harfe cevirdi
        // cunku kontrol buyukn harfle yapaacaz

        switch (secim) {
            case "1":
                kisiTuru = "OGRENCI";
                islemMenusu();
                break;
            case "2":
                kisiTuru = "OGRETMEN";
                islemMenusu();
                break;
            case "Q":

                break;
            default:
                System.out.println("Hatali giris yaptiniz");
                girisPaneli();
        }
    }

    private static void islemMenusu() {

        System.out.println("Sectigin kisi turu " + kisiTuru + ".");
        System.out.println("============= İŞLEMLER =============\n" +
                "         1-EKLEME\n" +
                "         2-ARAMA\n" +
                "         3-LİSTELEME\n" +
                "         4-SİLME\n" +
                "         5-ANA MENÜ\n" +
                "         0-ÇIKIŞ");
        System.out.println("Islem tercihini giriniz");
        int secilenIslem = scan.nextInt();

        switch (secilenIslem) {
            case 1:
                ekle();
                islemMenusu(); // islemMenusu'ne tekrar gidiyor
                break;
            case 2:
                arama();
                islemMenusu();
                break;
            case 3:
                listeleme();
                islemMenusu();
                break;
            case 4:
                silme();
                islemMenusu();
                break;
            case 5:
                girisPaneli();
                break;
            case 0:
                cikis();
                break;
            default:
                System.out.println("Hatali giris yaptiniz");
                islemMenusu();
        }
    }

    private static void cikis() {
        System.out.println("Cikis yapiliyor");
    }

    private static void silme() {
        System.out.println("*************** " + kisiTuru + " silme sayafasina hosgeldiniz ***************");

        boolean flag = true; // looplarin arasinda dolanip rahatca cikmak icin

        if (kisiTuru.equalsIgnoreCase("ogrenci")) {
            System.out.println("Silmek istedigin kimlik no giriniz ");
            String silinecekKimlikNo = scan.next().replaceAll(" ", "");
            for (Kisi each : ogrenciList) {
                if (each.getKimlikNo().equals(silinecekKimlikNo)) {
                    System.out.println("silinen ogrenci " + each.getAdSoyad());
                    ogrenciList.remove(each); // kulanicidan alinan ogrenci silindi
                    flag = false;
                    break;
                }
            }
            if (flag) { // senin girdigin  tc nolu ogrenci yoksa b if bogu calisir
                System.out.println("Bu tc kimlik nolu ogrenci yok");
            }
        }  // Bu if blogu ogrenciyi silme blogu
        else {
            System.out.println("Silinecek ogretmenin kimlik nosunu giriniz");
            String silinecekKimlikNo = scan.next().replaceAll(" ", "");

            for (Kisi each : ogretmenList
            ) {
                if (each.getKimlikNo().equals(silinecekKimlikNo)) {
                    System.out.println("Silinen ogretmen " + each.getAdSoyad());
                    ogretmenList.remove(each);
                    flag = false;
                    break;
                }
            }
            if (flag) { // kullanicinin girdigi tc no birr ogretmenle selesmmediyse bu if blogu calisir
                System.out.println("Bu tc ile ogretmen yok");
            }
        }
    }

    private static void listeleme() {
        if (kisiTuru.equalsIgnoreCase("ogrenci")) { // Bu satirda ogrenci ariyorsa calisir
            System.out.println("*************** " + kisiTuru + " listeleme sayafasina hosgeldiniz ***************");
            System.out.println("Ogrenci listesi " + ogrenciList);
        } else {
            for (Kisi each : ogretmenList
            ) {
                System.out.println("Ogretmen listesi " + each.toString());
            }
        }
    }

    private static void arama() {

        boolean flag = true; // bayrak yukarida = true olan her sart devam eder. aksiyon baslasin

        if (kisiTuru.equalsIgnoreCase("ogrenci")) { // Bu satirda ogrenci ariyorsa calisir
            System.out.println("*************** " + kisiTuru + " arama sayafasina hosgeldiniz ***************");
            // dummy
            System.out.println("Kimlik numaranizi giriniz");
            String arananKimlikno = scan.next().replace(" ", ""); // kullanici bosluk girerse diye bosluklari kaldirdik

            for (Kisi w : ogrenciList
            ) {
                if (w.getKimlikNo().equals(arananKimlikno)) {// kullanicinin girdigi tc ile ogrenciList'indeki tc'lerle eslesen var mi
                    System.out.println("Aradiginiz ogrenci " + w.getAdSoyad());
                    flag = false;
                }
            }
            if (flag) { // flag true ise hala bu if body'si calisie. yani aranan tc ile ogrenci yok demektir
                System.out.println("aranan tc ile ogrenci yok");// 96-108 ogrenci icn yapildi
            }

        } else { // else body'si tamamen ogretmen icin taselandi
            System.out.println("*************** " + kisiTuru + " arama sayafasina hosgeldiniz ***************");

            // dummy
            System.out.println("Kimlik numaranizi giriniz");
            String arananKimlikno = scan.next().replace(" ", ""); // kullanici bosluk girerse diye bosluklari kaldirdik

            for (Kisi w : ogretmenList
            ) {
                if (w.getKimlikNo().equals(arananKimlikno)) {// kullanicinin girdigi tc ile ogrenciList'indeki tc'lerle eslesen var mi
                    System.out.println("Aradiginiz ogretmnen " + w.getAdSoyad());
                    flag = false;
                }
            }
            if (flag) { // flag true ise hala bu if body'si calisie. yani aranan tc ile ogrenci yok demektir
                System.out.println("aranan tc ile ogretmen yok");// 96-108 ogrenci icn yapildi
            }
        }

    }


    private static void ekle() {
        // Bu method hem ogrenci hem de ogretmen eklemek icin tasarlandi.
        System.out.println("*************** " + kisiTuru + " ekleme sayafasina hosgeldiniz ***************");
        System.out.println("isim soyisim giriniz");
        scan.nextLine(); // dummy
        String adSoyad = scan.nextLine();

        System.out.println("kimlik giriniz");
        String kimlikNo = scan.next();

        System.out.println("yaş giriniz");
        int yas = scan.nextInt();

        if (kisiTuru.equals("OGRENCİ")) {//sonra doldur
            System.out.println("ogrenci no gir");
            String ogrenciNo = scan.next().replaceAll(" ", "");
            System.out.println("sınıf giriniz");
            String sinif = scan.next();
            Ogrenci ogrenci = new Ogrenci(adSoyad, kimlikNo, yas, ogrenciNo, sinif);  // parametre sirasi onemlii
            ogretmenList.add(ogrenci);
            System.out.println(ogrenciList);
        } else {
            scan.nextLine(); // dummy
            System.out.println("Lutfen bolumunuzu giriniz");
            String bolum = scan.nextLine();
            System.out.println("sicil no giriniz");
            int sicilNo = scan.nextInt();

            Ogretmen ogretmen1 = new Ogretmen(adSoyad, kimlikNo, yas, bolum, sicilNo); // parametre sirasi onemlii
            ogretmenList.add(ogretmen1);
            System.out.println(ogretmenList);
        }
    }
}