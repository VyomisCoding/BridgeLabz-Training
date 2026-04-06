import java.util.Scanner;

class CartItem {
    String itemName;
    double price;
    int quantity;

    void addItem(String name, double rate, int qty) {
        itemName = name;
        price = rate;
        quantity += qty;
        System.out.println("Added " + qty + " of " + itemName + " to the cart.");
    }

    void removeItem(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
            System.out.println("Removed " + qty + " of " + itemName + " from the cart.");
        }
    }

    void displayTotal() {
        double total = price * quantity;
        System.out.println("Total cost: $" + total);
    }

    void showItem() {
        System.out.println("Item: " + itemName + ", Price: $" + price + ", Quantity: " + quantity);
    }
}

public class SimulateShoppingCart{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CartItem cart = new CartItem();
        cart.addItem("Laptop", 999.99, 1);
        cart.showItem();
        cart.addItem("Laptop", 999.99, 2);
        cart.removeItem(1);
        cart.displayTotal();
    }
}
