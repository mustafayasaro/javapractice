package day003;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {

        // Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi tersten yazdirin

            Scanner scan = new Scanner(System.in); //mesaj vermeden de konsol da girdi girilir
            String kelime = scan.next();
            System.out.println(kelime.length());
            if (kelime.length() <= 4) {
                char bir = kelime.charAt(0);
                char iki = kelime.charAt(1);
                char uc = kelime.charAt(2);
                char dort = kelime.charAt(3);
                System.out.println("Tersden :" + dort + uc + iki + bir);
            } else {
                System.out.println("Girdiginiz kelime uzunlugu 4 karakterden fazla");
            }
    }
}
