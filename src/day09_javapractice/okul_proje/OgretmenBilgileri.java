package day09_javapractice.okul_proje;

public class OgretmenBilgileri {

    String isim;
    String soyIsim;
    int yas;
    String brans;
    String tel;

    public OgretmenBilgileri() {
    }
    //kullanmasak bile parametresiz constructor olusturmaliyiz

    @Override
    public String toString() {
        return "OgretmenBilgileri{" +
                "\nisim='" + isim + '\'' +
                "\nsoyIsim='" + soyIsim + '\'' +
                "\nyas=" + yas +
                "\nbrans='" + brans + '\'' +
                "\ntel='" + tel + '\'' +
                '}';
    }
    /*
    Eger toString methodunu yazmazsak cikti:
    ogretmenList = [day09_javapractice.okul_proje.OgretmenBilgileri@675d3402]
    olur yani referansi getirir array'i yazdirmak icin toString method'unu kullaniriz
     */


    public OgretmenBilgileri(String isim, String soyIsim,
                             int yas, String brans,
                             String tel) {

        this.isim = isim;
        this.soyIsim = soyIsim;
        this.yas = yas;
        this.brans = brans;
        this.tel = tel;
    }


}
