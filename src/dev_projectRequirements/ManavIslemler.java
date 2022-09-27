package dev_projectRequirements;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManavIslemler {

/* Basarili Market-manav alış-veriş programı.
    *
    * 1. Adım: Ürünler ve fiyatları içeren listeleri oluşturunuz.
    *         No        Ürün         Fiyat
            ====     =======      =========
            00  Domates           20.10 TL
            01  Patates           30.20 TL
            02  Biber             30.50 TL
            03  Soğan             20.30 TL
            04  Havuç             30.10 TL
            05  Elma               50.20 TL
            06  Muz                 100.90 TL
            07  Çilek              60.10 TL
            08  Kavun              40.30 TL
            09  Üzüm              20.70 TL
            10  Limon             10.50 TL

    * 2. Adım: Kullanıcının ürün nosuna göre listeden ürün seçmesini
    * isteyiniz.
    * 3. Adım: Kaç kg satın almak istediğini ve urun kodunu  aliniz.
    * 4. Adım: Alınacak bu ürünü sepete ekleyiniz
    * 5. Sepeti yazdırınız.
    * 6. Eğer devam etmek istiyorsa yeniden ürün seçme kısmına
    * yönlendiriniz.
    * 7. Eğer bitirmek istiyorsa ödeme kısmına geçiniz ve
    * ödeme sonrasında programı bitirinzi.
    */

    static Scanner scan = new Scanner(System.in);
    static double toplamFiyat = 0;

    public static void main(String[] args) {
        List<String> urunler = new ArrayList<String>();
        urunler.add("Domates");
        urunler.add("Patates");
        urunler.add("Biber");
        urunler.add("Soğan");
        urunler.add("Havuç");
        urunler.add("Elma");
        urunler.add("Muz");
        urunler.add("Çilek");
        urunler.add("Kavun");
        urunler.add("Üzüm");
        urunler.add("Limon");

        List<Double> urunFiyalari = new ArrayList<Double>();
        urunFiyalari.add(20.10);
        urunFiyalari.add(30.20);
        urunFiyalari.add(30.50);
        urunFiyalari.add(20.30);
        urunFiyalari.add(30.10);
        urunFiyalari.add(50.20);
        urunFiyalari.add(100.90);
        urunFiyalari.add(60.10);
        urunFiyalari.add(40.30);
        urunFiyalari.add(20.70);
        urunFiyalari.add(10.50);


        urunlerVeFiyatlar(urunler, urunFiyalari);
        System.out.println("Lutfen secmek istediginiz urunun numarasini giriniz");
        int urunNo = scan.nextInt();
        System.out.println("Lutfen kac kilo istediginiz yaziniz");
        double urunMiktari = scan.nextDouble();
        double sepetFiyati = 0;
        sepeteEkle(urunFiyalari, urunNo, urunMiktari, sepetFiyati);

        System.out.println("Devem etmek istiyor musunuz? e/h");
        String devamMi = scan.next();
        do {
            urunlerVeFiyatlar(urunler, urunFiyalari);
            System.out.println("Lutfen secmek istediginiz urunun numarasini giriniz");
            urunNo = scan.nextInt();
            System.out.println("Lutfen kac kilo istediginiz yaziniz");
            urunMiktari = scan.nextDouble();
            sepetFiyati = 0;
            System.out.println("Devem etmek istiyor musunuz? e/h");
            devamMi = scan.next();
            sepeteEkle(urunFiyalari, urunNo, urunMiktari, sepetFiyati);
        } while (devamMi.equals("e"));


        odeme(toplamFiyat);

    }

    private static void odeme(double toplamFiyat) {
        System.out.println("Toplam odenecek tutar : " + toplamFiyat);
        System.out.println("Nasil odeme yapmak istersiniz. Seciniz \n1-Nakit\n2-Kredi karti\n3-Bitcoin\n4-Veresiye");
        int odemeSekli = scan.nextInt();
        switch (odemeSekli) {
            case 1:
                System.out.println("Odemeniz nakit olarak alindi");
                break;
            case 2:
                System.out.println("Odemeniz kredi karti olarak alindi");
                break;
            case 3:
                System.out.println("Odemeniz bitcoin olarak alindi");
                break;
            case 4:
                System.out.println("Odemeniz verisiye olarak alinacak");
                break;
            default:
                System.out.println("Yanlis secim yaptiniz");
        }
    }

    private static void sepeteEkle(List<Double> urunFiyalari, int urunNo, double urunMiktari, double sepetFiyati) {

        for (int i = 0; i < urunFiyalari.size() - 1; i++) {
            if (urunNo == i) {
                sepetFiyati = urunFiyalari.get(i) * urunMiktari;
                toplamFiyat += sepetFiyati;
            }
        }
        System.out.println(toplamFiyat);
    }

    private static void urunlerVeFiyatlar(List<String> urunler, List<Double> urunFiyalari) {

        for (int i = 0; i < urunler.size() - 1; i++) {
            System.out.println(i + "-" + urunler.get(i) + " " + urunFiyalari.get(i) + " TL");
        }
    }


}
