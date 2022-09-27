package day07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q03_ArrayList {

    /*
     * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
     * not kisa metodlar kullamayiniz
     * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
     */

    public static void main(String[] args) {


        int[] arr = {2, 5, -9, 45, 43, 11, 8, 102, 47, 0};

        int n = 4;

        //Bir list olusturdum List'teki method'lari kullanabilmek icin
        List<Integer> list = new ArrayList<>();

        //array'deki her elemani list'e ekledim
        for (int each: arr
             ) {
            list.add(each);
        }

        List<Integer> maxList = new ArrayList<>();
        int count = 1;
        while(count<=n){
            int max = list.get(0); // listin ilk elemanini max varsayiyoruz
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i)>max){  // list'in herhangi bir elemani max'dan buyukse
                    max = list.get(i);  // o elemani max'a atiyoruz
                }
            }
            maxList.add(max);
            list.remove(list.indexOf(max)); // maxList'e ekledigim sayiyi list'ten kaldirdik
            count++;
        }

        System.out.println("Array'in max " + n + " elemani " + maxList);






















        //   int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        //   Arrays.sort(arr);
        //  List<Integer> list = new ArrayList<>();
        //   for (int i = 0; i < arr.length; i++) {
        //       list.add(arr[i]);
        //   }
        //   System.out.println(list);
        //   int sayi = 3;

        //   for (int i = list.size()-1; i >=0 ; i--) {
        //       while(sayi>0){
        //           System.out.print(list.get(i) + " ");  // 8 7
        //           sayi--;
        //           i--;
        //       }
        //   }
    }
}