package day15_OOP;

import java.util.Scanner;

public class Saat_Dakika {

    public static void main(String[] args) {
/*
        Kullanıcıdan 2 sayı girmesini isteyeceğiz, girilen bu değerlerden
        biri saati diğeri de dakikayı temsil edecek. Bize akrep ile yelkovan
        arasındaki küçük açıyı hesaplayıp değeri açısal olarak döndüren metodu yazınız

        Örnek :

        input : hour : 12,  minutes : 30
        Output: 165
    */


        int hour = 12;
        int minutes = 35;
        System.out.println(angleClock(hour, minutes));


    }
    public static double angleClock(int hour, int minutes){
        double ek = (double) minutes/12;
        double hourAngle = ((hour%12)*30+(ek*6));
        double newMinute = (double) minutes/5;
        double minuteAngle = newMinute*30;
        double angle = Math.abs(hourAngle-minuteAngle);

        if (angle>180) return(360-180);
        else return angle;
    }


}
