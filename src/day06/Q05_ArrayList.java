package day06;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.*;

public class Q05_ArrayList {
    public static void main(String[] args) {

        /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
         *  1. Kullanicidan ismini isteyelim
         *  2. Kullanici adindaki bosluklari silelim.
         *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
         *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
         *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.

         */


        List<String> isimler = new ArrayList<>();
        isimler.add("Enes");
        isimler.add("Ismail");
        isimler.add("Abdulbaki");
        isimler.add("Emre");
        isimler.add("Melisa");
        isimler.add("Oguz");

        System.out.println("Isimler = " + isimler);

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kulanici adinizi giriniz");
        String isim = scan.nextLine().trim();

        boolean kullaniciAdiVarMi = isimler.contains(isim);

        if (kullaniciAdiVarMi) {
            System.out.println("Bu kullanici adi zaten alinmis");
        } else {
            System.out.println("Bu kullanici adini kullanbilirsiniz");
        }

        if (kullaniciAdiVarMi) {
            int randomSayi = new Random().nextInt(100);
            isim = isim + "" + randomSayi;
            System.out.println("Yeni kullanici adiniz :" + isim);
            isimler.add(isim);
            System.out.println(isimler);
        } else {
            System.out.println("Yeni kullanici adiniz : " + isim);
            isimler.add(isim);
            System.out.println(isimler);
        }


    }
}
