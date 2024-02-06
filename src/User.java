import java.util.Scanner;

public class User extends  Product {
    private String firstName;
    private String lastName;
    private String email;
    private String password;




    public User(String name, String description, int price, int createdAt, String firstName, String lastName, String email, String password) {
        super(name, description, price, createdAt);
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public User() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                "} " + super.toString();
    }



    User[] users = new User[100];
    int counter = 0;
    public  void registr(){
        User user = new User();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        user.setFirstName(scanner.nextLine());

        System.out.print("Enter your last name: ");
        user.setLastName(scanner.nextLine());

        System.out.print("Enter your email: ");
        user.setEmail(scanner.nextLine());

        System.out.print("Enter your password: ");
        user.setPassword(scanner.nextLine());

        users[counter]=user;
        counter++;
        System.out.println("✅ Soccessfully registeren");
    }

   public  void login(){

        Scanner scanner1 = new Scanner(System.in);
       System.out.print("email jaz: ");
       String login = scanner1.nextLine();

       System.out.print(" passwort");
       String passwortt= scanner1.nextLine();

       System.out.println(" привестую вас");

       for (int i = 0; i < counter; i++) {
           if (users[i].getEmail().equals(login) && users[i].getPassword().equals(passwortt) ) {

       System.out.print(STR."""
            Welcome
               \{users[i].getFirstName()}
               \{users[i].getLastName()}
               """);
               System.out.println("Komanda tandoo: ");
   }
}
   }

}











