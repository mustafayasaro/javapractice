package Oop_Cons;

public class Book {

    public String name;
    public int pageNumber;
    public String author;
    public String publisher;
    public double price;

    public Book(){

    }
    public Book(String name, int pageNumber, String author, String publisher, double price) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.name = "Sekere Portakali";
        book1.author = "Jose Maure de Vasconcelos";
        book1.pageNumber = 180;
        book1.publisher = "Can Yayinlari";
        book1.price = 25;
        book1 = new Book();
    }
}
