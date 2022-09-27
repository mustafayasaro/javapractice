package day04;

public class Q03_ForLoop {

    public static void main(String[] args) {

        /*
        1*1=1
        1*2=2
        1*3=3
        .
        .
        .
        1*10=10
         */


        int sonuc = 1;

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <=1 ; j++) {
                sonuc = i*j;
            }
            System.out.println("1 x " + i + " = " + sonuc);
        }


    }
}
