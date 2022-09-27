package day14;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q01 {

    public static void main(String[] args) {

        /*

        Integer olarak artan değerler şeklinde verilen dizinin elemanlarının karesini alıp yine artan
        değerlerde ekrana yazdıran metod oluşturunuz

        Örnek :

        Input: nums = [-4,-1,0,3,10]
        Output: [0,1,9,16,100]
 */

        int[] sayilar = {-4, -1, 0, 3, 10};

        System.out.println(Arrays.toString( solutions(sayilar)));
        //[0, 1, 9, 16, 100]
    }

    private static int[] solutions(int[] sayilar) {

        int i = 0;
        for (;i < sayilar.length; i++) {
            sayilar[i] = sayilar[i] * sayilar[i];
        }
        Arrays.sort(sayilar);
        return sayilar;
    }
}
