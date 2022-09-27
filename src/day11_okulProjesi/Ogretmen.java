package day11_okulProjesi;

public class Ogretmen extends Kisi {

    private String bolum;
    private int sicilNo;

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    @Override
    public String toString() {
        return "Ogretmen{" +
                "bolum='" + bolum + '\'' +
                ", sicilNo=" + sicilNo +
                '}' + super.toString();
    }

    public int getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(int sicilNo) {
        this.sicilNo = sicilNo;
    }

    public Ogretmen() {
    }

    public Ogretmen(String adSoyad, String kimlikNo, int yas, String bolum, int sicilNo) {
        super(adSoyad, kimlikNo, yas);
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }
}



