
import java.util.Scanner;

class Item {
    String itemCode;
    String itemName;
    double price;

    void getItemDetails(Scanner sc) {
        System.out.print("Enter Item Code: ");
        itemCode = sc.nextLine();

        System.out.print("Enter Item Name: ");
        itemName = sc.nextLine();

        System.out.print("Enter Item Price: ");
        price = sc.nextDouble();
        sc.nextLine(); // buffer clear
    }

    void displayItemDetails() {
        System.out.println("\nitemCode : " + itemCode);
        System.out.println("itemPrice : " + price);
        System.out.println("itemName : " + itemName);
        System.out.println("----------------------------");
    }
}

public class TrackInventoryItems{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Item i1 = new Item();
        i1.getItemDetails(sc);
        i1.displayItemDetails();

        Item i2 = new Item();
        i2.getItemDetails(sc);
        i2.displayItemDetails();

        Item i3 = new Item();
        i3.getItemDetails(sc);
        i3.displayItemDetails();

    }
    
}
