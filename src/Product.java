import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Product {
    private String name;
    private String description;
    private int price;
    private int createdAt;
   Product[] products = new Product[100];
    int countProducts = 0;
    public Product() {
    }

    public Product(String name, String description, int price, int createdAt) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.createdAt = createdAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(int createdAt) {
        this.createdAt = createdAt;
    }

//    @Override
//    public String toString() {
//        return "Product{" +
//                "name='" + name + '\'' +
//                ", description='" + description + '\'' +
//                ", price=" + price +
//                ", createdAt='" + createdAt + '\'' +
//                '}';
//    }



    public   void addProduct(){
        Book book = new Book();

        Scanner scanner= new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

         Product product =new Product();
//
//        System.out.print(" Name product: ");
//        product.setName(scanner.nextLine());
//
//        System.out.print("description: ");
//        product.setDescription(scanner.nextLine());
//
//        System.out.print("Price: ");
//        product.setPrice(scanner1.nextInt());
//
//        System.out.print("createdAt: ");
//        product.setCreatedAt(scanner1.nextInt());
//
//        products[countProducts]=product;
//        countProducts++;
//       System.out.println(" uspeshna ✅");

        System.out.println("Device or Book ");
        String num = scanner.nextLine();

        if (num.equalsIgnoreCase("Device")){
            Device device = new Device();
            System.out.print("Enter product name: ");
            device.setName(scanner.nextLine());

            System.out.print("Enter your description: ");
            device.setDescription(scanner.nextLine());

            System.out.print("Enter your price: ");
            device.setPrice(scanner.nextInt());

            System.out.print("Enter your createAt");
            device.setCreatedAt(scanner.nextInt());

            System.out.print("Enter product brand: ");
            device.setBrand(scanner.nextLine());

            System.out.print("Enter product color: ");
            device.setColor(scanner.nextLine());

            System.out.print("Enter your isNew: ");
            device.setName(scanner.nextLine());

            System.out.print(" Enter your Memory");
            device.setMemory(scanner.nextLine());

             products[countProducts]=device;
             countProducts++;
        }
        else if (num.equalsIgnoreCase("Book")){

            System.out.print("Name product: ");
            book.setName(scanner.nextLine());

            System.out.print("description: ");
            book.setDescription(scanner.nextLine());

            System.out.print("Price: ");
            book.setPrice(scanner1.nextInt());

            System.out.print("createdAt: ");
            book.setCreatedAt(scanner.nextInt());

            System.out.print("author: ");
             book.setAuthor(scanner.nextLine());

            System.out.print("fullname: ");
            book.setFullname(scanner.nextLine());

            products[countProducts] = book;
            countProducts++;
        }
    }

    public void getAllProducts(){
        for (int i = 0; i < countProducts; i++) {
            System.out.println(products[i].toString());
        }
    }
    public Product[] getAllBook(){
        return Arrays.copyOf(products,countProducts);
    }
  public Product[] getAllDevice(){
        return Arrays.copyOf(products,countProducts);
  }


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", createdAt='" + createdAt + '\'' +
                '}';
    }
}