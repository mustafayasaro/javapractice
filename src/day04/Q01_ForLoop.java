package day04;

public class Q01_ForLoop {
    public static void main(String[] args) {


         /*
    100'den 0'a kadar 13'e tam bölünebilen sayıları ekrana yazdırınız (büyükten küçüğe).
    Ekran Çıktısı asagidaki sekilde olsun; ayrica sonrasinda bu sayilarin toplamini da yazdirin
    istenen sonuc :
     91
     78
     65
     52
     39
     26
     13       */

        int toplam = 0;

        for (int i = 100; i >= 0; i--) {
            if (i % 13 == 0) {
                System.out.println(i);
                toplam += i;
            }
        }

        System.out.println("toplam = " + toplam);


    }
}
