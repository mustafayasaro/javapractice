package day07;

import java.util.ArrayList;
import java.util.List;

public class Q07_SpecialCharRemoveArrayList {
      /*
   getSum isminde bir method oluşturun.
   Parametresi ArrayList'tir.
   Dizideki tüm $ ları kaldır ve tüm sayıları topla
   return yaptğımız veri tipi 'int' olmalıdır.
   sonuç 0'dan küçükse, -1 yazdırın.

   Örnek1:
   ArrayList = $13, $15, $20
   Cevap = 48 olmalı

   Örnek 2 :
   ArrayList= $-13, $0, $0
   Cevap = -1 olmalı.
    */

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("$13");
        list.add("$15");
        list.add("$20");

        getSum(list);


    }

    private static void getSum(List<String> list) {

        int toplam = 0;
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int price = Integer.valueOf(list.get(i).replace("$", ""));
            toplam += price;
        }

        if (toplam > 0) {
            System.out.println(toplam); // 48
        }else {
            System.out.println("-1");
        }



    }
}
