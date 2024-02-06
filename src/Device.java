import java.util.Arrays;
import java.util.Scanner;

public class Device extends Product {
    private String brand;
    private String color;
    private String isNew;
    private String memory;

  public Device(){}

    public Device(String name, String description, int price, int createdAt, String brand, String color, String isNew, String memory) {
        super(name, description, price, createdAt);
        this.brand = brand;
        this.color = color;
        this.isNew = isNew;
        this.memory = memory;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getIsNew() {
        return isNew;
    }

    public void setIsNew(String isNew) {
        this.isNew = isNew;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", isNew='" + isNew + '\'' +
                ", memory='" + memory + '\'' +
                "} " + super.toString();
    }
//    public  void newDevice(){
//
//        for (int i = 0; i < countProducts; i++) {
//            System.out.println(products[i].toString());
//        }
//        System.out.println("[]");
//    }

//    public  void newDevice(){
//
//        for (int i = 0; i < countProducts; i++) {
//            System.out.println(products[i].toString());
//        }
//        System.out.println("[]");
//        for (int i = 0; i < countProducts; i++) {
//            System.out.println(devices[i].countProducts);
//
//        }
public  static void newDevice(Product[] products){
    for (Product dd:products) {
        if (dd instanceof Device){
            System.out.println(dd);
        }
    }
}


}





