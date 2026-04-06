
import java.util.Scanner;

class MobilePhone {
    String brand;
    String model;
    double price;

    void getMobileDetails(Scanner sc) {
        System.out.print("Enter Mobile Brand: ");
        brand = sc.nextLine();

        System.out.print("Enter Mobile Model: ");
        model = sc.nextLine();

        System.out.print("Enter Mobile Price: ");
        price = sc.nextDouble();
        sc.nextLine(); // clear buffer
    }

    void displayMobileDetails() {
        System.out.println("\nBrand of mobile: " + brand);
        System.out.println("Model of mobile: " + model);
        System.out.println("Price of mobile: " + price);
        System.out.println("------------------------------");
    }
}

public class MobilePhoneDetails{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MobilePhone m1 = new MobilePhone();
        m1.getMobileDetails(sc);
        m1.displayMobileDetails();

        MobilePhone m2 = new MobilePhone();
        m2.getMobileDetails(sc);
        m2.displayMobileDetails();

        MobilePhone m3 = new MobilePhone();
        m3.getMobileDetails(sc);
        m3.displayMobileDetails();
    }
}