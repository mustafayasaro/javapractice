package day08_practice.restorant;

public class Musteri {

    // once bize bir menu gelir = menu bir objedir ve menu objesi create ederiz
    // menuyu gorduk dolayisiyla siparis verecegiz
    // sipariste bu class'da olusturulacak olan bir objedir
    // Bu objeleri create edebilmemiz icin mutfak clasindan constructor olustururuz

    public static void main(String[] args) {


    Mutfak menu = new Mutfak();
    // menu objesini parametresiz olusturduk dolayisiyla
    // constructor'in icerisindeki elemanlari getirir
    // onlar da standart degerler yani butun variable'lar gelir

        System.out.println("menu.toString() = " + menu.toString());

        /*
           menu.toString() = Mutfak{
           yemekler='Adana kebabi, Urfa ciger, kusbasi, kusleme',
            araSicak='Yayla corbasi, mercimek corbas, dugun corbasi',
           tatlilar='baklava, sutlac, gullac, kazandibi, kunefe',
           icecekler='ayran, salgam, kola'}
         */


        Mutfak siparis = new Mutfak("Adana kebabi", "mercimek", "kunefe", "salgam");


        System.out.println("siparis = " + siparis);
        /*
        siparis = Mutfak{
                  yemekler='Adana kebabi',
                   araSicak='mercimek',
                  tatlilar='kunefe',
                  icecekler='salgam'}
         */


        /*
        Constructor obje uretmeye yarar
        Java Objecct Oriented Programing'dir
        yani objeler uzerinde cok duracagiz
         */


    }


}
