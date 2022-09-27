package day003;

public class Q04_IQ_MethodCreation$$$$$ {

    public static void main(String[] args) {
        
        
        /*
          Problem tanımı :
          Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
          Test Data:
          input: "aabbcccccddddaaa"
          output: abcd
       */

        tbirKereYazdir("aaaabbbbbcccccdddddddsad");
    }

    public static void tbirKereYazdir(String str) {
        String output = "";  //  String default degeri "" hiclik oldugu icin isleme etki etmesin diye atama yaptik

        for (int i = 0; i < str.length() ; i++) {   // int i = 0; i <= str.length()-1 ; i++
            if (!output.contains(str.substring(i,i+1))){ //  tekrarsiz karakterleri dondurecegimiz icin sonucumuz
                                                           // str'dan aldigimiz herhangi bir karakteri icermesin
                output += str.substring(i, i+1);
            }
        }
        System.out.println(output);

    }


}

