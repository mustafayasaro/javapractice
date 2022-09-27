package day05;

import java.util.Scanner;

public class Q10_Odev {

    public static void main(String[] args) {

        // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.


        String pin = "mehmet.1234";
        int girisHakki = 3;

        Scanner scan = new Scanner(System.in);
        System.out.println("*********HOSGELDINIZ***********");

        while (true) { // false oldugu surece calis, true olunca dur
            System.out.println("Pin kodunuzu giriniz");
            String girilenPin = scan.nextLine();
            if (pin.equalsIgnoreCase(girilenPin)) {
                System.out.println("Basarili giris yaptiniz");
                break;
            } else {
                System.out.println("Yanlis giriz yaptiniz... ");
                girisHakki--;
                System.out.println(girisHakki + " giris hakkiniz kaldi");
            }
            if (girisHakki==0){
                System.out.println("Giris hakkiniz kalmadi. Blocklandiniz");
            }
        }


    }
}
