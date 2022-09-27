package day16_Oop_Poynorphism;

public class Runner {
    public static void main(String[] args) {

        Civciv civciv1 = new Civciv();
        Animal civciv2 = new Civciv();
        hayvanSeCikar(civciv2);
        Ordek ordek1 = new Ordek();
        hayvanSeCikar(ordek1);
        hayvanSeCikar(civciv1);
    }

    private static void hayvanSeCikar(Animal hayvan) {
        hayvan.sesiCikar();
    }

}
