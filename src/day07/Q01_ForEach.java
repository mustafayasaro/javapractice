package day07;

public class Q01_ForEach {

    // int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,14,15,16,17,18};
    // verilen array de once cift olan sayilari, sonra da tek olan sayilari for each loop kullanarak yazdiriniz..

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 15, 16, 17, 18};

        int tek = 0;
        int cift = 0;

        for (int each : arr
        ) {
            if (each % 2 != 0) {
                tek += each;
            } else {
                cift += each;
            }
        }
        System.out.println("cift = " + cift);//cift = 90
        System.out.println("tek = " + tek); //  tek = 68

    }
}
