package day14;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        /*

        Integer olarak artan değerler şeklinde verilen dizinin elemanlarının karesini alıp yine artan
        değerlerde ekrana yazdıran metod oluşturunuz

        Örnek :

        Input: nums = [-4,-1,0,3,10]
        Output: [0,1,9,16,100]
 */

        int[] sayilar = {-4, -1, 0, 3, 10};
        int[] num = Arrays.stream(sayilar).map(x-> x*x).sorted().toArray();
        System.out.println(Arrays.toString(num));
        //   [0, 1, 9, 16, 100]
    }
}
