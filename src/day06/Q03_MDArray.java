package day06;

public class Q03_MDArray {

    public static void main(String[] args) {
        /*
         * Girilen Multidimensional arraydeki cift sayilari toplayan bir method
         * yaziniz
         * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
         *
         * OUTPUT : Arraydeki cift sayilarin toplami : 30
         */

        int[][] sayilar = {{1, 3, 6}, {2, 8}, {5, 7, 9, 14}};
        int toplam = 0;
        cifSyailarToplami(sayilar, toplam);


    }

    private static void cifSyailarToplami(int[][] sayilar, int toplam) {
        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar[i].length; j++) {
                if (sayilar[i][j] % 2 == 0) {
                    toplam += sayilar[i][j];
                }
            }
        }
        System.out.println("toplam = " + toplam); // toplam = 30

    }
}
