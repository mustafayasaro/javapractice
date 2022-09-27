package day08_practice.restorant;

public class Mutfak {

    // once variabllar olacak
    // yemekleri , tatlilari ve icecekleri temsil edecek

    public String yemekler = "Adana kebabi, Urfa ciger, kusbasi, kusleme";
    public String araSicak = "Yayla corbasi, mercimek corbas, dugun corbasi";
    public String tatlilar = "baklava, sutlac, gullac, kazandibi, kunefe";
    public String icecekler = "ayran, salgam, kola";

    public Mutfak(String adana_kebabi, String mercimek, String kunefe, String salgam) {
        this.yemekler = adana_kebabi;
        this.araSicak = mercimek;
        this.tatlilar = kunefe;
        this.icecekler = salgam;
        // this kullanmadan da yapariz ama dinamik olmaz
    }

    public Mutfak() {

    }

    @Override
    public String toString() {
        return "Mutfak{" +
                "\nyemekler='" + yemekler + '\'' +
                ",\n araSicak='" + araSicak + '\'' +
                ", \ntatlilar='" + tatlilar + '\'' +
                ", \nicecekler='" + icecekler + '\'' +
                '}';
    }
    //menu objesini parametresiz olusturacagimiz icin
    // toString methodu olusturmaliyiz
    // toString method'u butun variable'lari cagirilan class'a gider

}
