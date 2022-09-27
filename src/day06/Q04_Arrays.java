package day06;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q04_Arrays {
    public static void main(String[] args) {

        /*
         *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
         *  Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
         */
        String str = "Verilen bir cumledeki bosluklar haric character sayisini bulunuz";
        String str1 = str.replace(" ", "");
        String[] arr = str1.split("");
        System.out.println(Arrays.toString(arr));
//[V, e, r, i, l, e, n, b, i, r, c, u, m, l, e, d, e, k, i, b, o, s, l, u, k, l, a, r, h, a, r, i, c, c, h, a, r, a, c, t, e, r, s, a, y, i, s, i, n, i, b, u, l, u, n, u, z]



    }
}
