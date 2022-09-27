package day06;

import java.util.Arrays;

public class Q02_MDArray {
    public static void main(String[] args) {
        /*
         *  String 2D array olustur
         *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
         *  String de $ varsa 3.2 ile carp
         *  String de € varsa 4.2 ile carp
         *  elemanlarin toplamini double olarak yazdir
         */

        String[][] str = {{"$12", "$22", "0$"}, {"€9", "€40", "$1"}, {"€12", "$2", "$0"}};
        double toplam = 0.0;

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length; j++) {
                if (str[i][j].contains("$")) {
                    String str1 = str[i][j].replace("$", "");
                    double sayi1 = Double.parseDouble(str1);
                    toplam = toplam + sayi1 * 3.2;
                }
                if (str[i][j].contains("€")) {
                    String str1 = str[i][j].replace("€", "");
                    double sayi1 = Double.parseDouble(str1);
                    toplam = toplam + sayi1 * 4.2;
                }

            }
        }

        System.out.println(Arrays.deepToString(str)); // [[$12, $22, 0$], [€9, €40, $1], [€12, $2, $0]]
        System.out.println("toplam = " + toplam); //  toplam = 374.6

    }
}
