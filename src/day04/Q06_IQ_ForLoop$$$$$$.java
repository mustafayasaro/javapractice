package day04;

public class Q06_IQ_ForLoop$$$$$$ {

    public static void main(String[] args) {

        /* Interview Question
         Write a Java program to reverse a string. Use for loop and create a method called
          reverseString
          */


        String str = "Java is cool";
        reverseString(str);

    }

    public static void reverseString(String str) {
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);

        }
        System.out.println("reverse = " + reverse);

    }
}
