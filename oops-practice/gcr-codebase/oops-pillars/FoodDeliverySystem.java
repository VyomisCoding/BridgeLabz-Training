import java.util.*;

interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

// Abstract Food Item class
abstract class FoodItem {
    private String itemName;
    protected double price;
    protected int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println("Item Name : " + itemName);
    }
}

// Veg food item
class VegItem extends FoodItem {

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return price * quantity;
    }
}

// Non-veg food item
class NonVegItem extends FoodItem implements Discountable {

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        // Extra charge for non-veg items
        return (price + 50) * quantity;
    }

    @Override
    public double applyDiscount() {
        return 100;
    }

    @Override
    public String getDiscountDetails() {
        return "Flat ₹100 discount on Non-Veg items";
    }
}


public class FoodDeliverySystem {
    public static void main(String[] args) {

        ArrayList<FoodItem> orderList = new ArrayList<>();

        orderList.add(new VegItem("Paneer Butter Masala", 250, 2));
        orderList.add(new NonVegItem("Chicken Biryani", 300, 1));

        for (FoodItem item : orderList) {

            item.getItemDetails();
            double total = item.calculateTotalPrice();

            // Check discount availability
            if (item instanceof Discountable) {
                total -= ((Discountable) item).applyDiscount();
            }

            System.out.println("Final Price : " + total);
            System.out.println("-----------------------");
        }
    }
}
