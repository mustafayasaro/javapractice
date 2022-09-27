package day08_practice;

public class BatchConstructor {

    /*
    Constructordan obje uretececm
    daha sonra method call yapacaagim
    en son bunlari yazdiracagim(sout)
     */
    public static void main(String[] args) {


        Batch batch = new Batch();
        // Batch classindan bir obje olusturdum
        // bu obje Batch classina girmemizi saglayan anahtardir



        //System.out.println(batch);
        // day08_practice.Batch@5b464ce8
        // Batch classinda hic birsey olmadigi icin referans degeri alir
        //Oyleyse Batch classinda variable'lar ve method olustururuz


        System.out.println("batch.str2 = " + batch.str2);
        // batch.str2 = Batch 81 82 83 Constructor'u anlamadi

        batch.batch();
        // str1 = Batch 81 82 83 Constructor'u anladi

    }
}
