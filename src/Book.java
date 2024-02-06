import java.math.BigDecimal;
import java.util.Scanner;

public class Book extends Product {
    private String author;
    private String fullname;


    public Book(String name, String description, int price, int createdAt, String author, String fullname) {
        super(name, description, price, createdAt);
        this.author = author;
        this.fullname = fullname;
    }

    public Book() {

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", fullname='" + fullname + '\'' +
                "} " + super.toString();
    }

    public static void getAllBook(Product[]products) {
        for (Product pr: products){
            if (pr instanceof Book){
                System.out.println(pr);
            }
        }
    }

//    public  void newBook() {
//        for (int i = 0; i < countProducts; i++) {
//            System.out.println(products[i].toString());
//        }
//            System.out.println("[]");

//        for (int i = 0; i < countProducts; i++) {
//            System.out.println(books[i].countProducts);
//
//        }
    }

