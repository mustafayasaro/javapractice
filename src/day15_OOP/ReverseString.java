package day15_OOP;

public class ReverseString {
    public static void main(String[] args) {

        String name = "Java Dunyasi";
        System.out.println(reverse(name));
    }

    public static String reverse(String name) {
        String str2 = "";
      /*  String[] str = name.split("");
        for (int i = str.length - 1; i >= 0; i--) {
            str2 += str[i];
        }
        return str2;*/
        String[] str = name.split("");
        String temp = "";
        for (int i = 0; i < name.length(); i++) {
            String start = str[i];
            String end = str[str.length-(i+1)];
            if (start==end) break;
            temp = start;
            start = end;
            str2 +=start;
        }

        return str2;
    }
}
