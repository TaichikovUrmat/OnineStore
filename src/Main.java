import java.util.Scanner;

import static java.lang.StringTemplate.STR;
import static java.lang.StringTemplate.combine;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       Product[] products = new Product[100];

        User user = new User();
        Product product = new Product();
        Book book = new Book();
        Device device = new Device();

        boolean isTrue = false;

        while (true) {
            if (!isTrue) {
                System.out.println("""
                        1.Register
                        2.Login
                        3.Exit
                        """);
                System.out.println("Виберите команду: ");
            } else {
                System.out.println("""
                        0.Logout
                        1.Add new product
                        2.Get all products
                        3.Get all book
                        4.Get all device
                         
                        """);
                System.out.println("Выберите команду");
            }
                if (!isTrue) {
                    switch (scanner.nextLine()) {
                        case "1":
                            user.registr();

                            break;
                        case "2":
                            isTrue = true;
                            user.login();

                            break;
                        case "3":
                            break;
                        default:
                            System.out.println("Ошибка!");
                    }
                } else  {
                    switch (scanner.nextLine()) {
                        case "0":
                            isTrue = false;
                            break;
                        case "1","add":
                            product.addProduct();
                            break;
                        case "2","Ps":
                            product.getAllProducts();
                            break;
                        case "3","book":
                            Book.getAllBook(product.getAllBook());
                            break;
                        case "4","de":
                            Device.newDevice(product.getAllDevice());

                        default:
                            System.out.println(" Неверная комада!");

                    }
                }
            }

        }
    }





