package day02;

import java.util.Scanner;

public class Q08_StringManupulation {
    public static void main(String[] args) {

        /*
          Kullanicidan bir kelime girmesini isteyin.
          * Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
          * kelimenin ortasindaki karakteri yazdirin.
          */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime girin");
        String kelime = scan.nextLine();
        if (kelime.length() %2 != 0 && kelime.length() == 3){
            char ortanca = kelime.charAt((kelime.length()-1)/2);
            System.out.println(ortanca);
        }

    }
}
