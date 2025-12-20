
import java.util.Scanner;

public class CoffeeCounterChronicles {
    // GST percentage (5%)
    static final double GST_RATE = 0.05;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("\nEnter coffee type (Espresso / Latte / Cappuccino) or type 'exit' to stop: ");
            String coffeeType = input.nextLine().trim();

            // Exit condition
            if (coffeeType.equalsIgnoreCase("exit")) {
                System.out.println("Cafe closed for the day ☕");
                break;
            }

            double price = getCoffeePrice(coffeeType);

            if (price == 0) {
                System.out.println("Sorry, this coffee is not available.");
                continue;
            }
            System.out.print("Enter quantity: ");
            int quantity = input.nextInt();
            input.nextLine();

            double totalBill = calculateTotal(price, quantity);
            double finalAmount = addGST(totalBill);

            displayBill(coffeeType, quantity, finalAmount);
        }

        input.close();
    }

    // method to get price based on coffee type
    static double getCoffeePrice(String type) {
        switch (type.toLowerCase()) {
            case "espresso":
                return 120;
            case "latte":
                return 150;
            case "cappuccino":
                return 180;
            default:
                return 0;
        }
    }

    // method to calculate base total
    static double calculateTotal(double price, int qty) {
        return price * qty;
    }

    // method to add GST
    static double addGST(double amount) {
        return amount + (amount * GST_RATE);
    }

    // method to print final bill
    static void displayBill(String coffee, int qty, double amount) {
        System.out.println("\n--- BILL DETAILS ---");
        System.out.println("Coffee Type : " + coffee);
        System.out.println("Quantity    : " + qty);
        System.out.println("Total Amount (incl. GST): ₹" + Math.round(amount * 100.0) / 100.0);
    }
}
