import java.util.ArrayList;


interface Taxable{    // interface for tax-related operations
    double calculateTax();
    String getTaxDetails();
}

// Abstract Product class
abstract class Product{
    //Encapsulated fields
    private int productId;
    private String name;
    private double price;

    //constructor
    public Product(int porductId, String name, double price){
        this.productId=productId;
        this.name=name;
        this.price=price;
    }

    // Abstract method for discount calculation
    public abstract double calculateDiscount();
    public int getProductId(){
        return productId;
    }

    public void setProductId(int productId){
        this.productId=productId;
    }  

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

// Electronics product class
class Electronics extends Product implements Taxable {

    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10;      // 10% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18;     // 18% GST
    }

    @Override
    public String getTaxDetails() {
        return "Electronics Tax: 18% GST";
    }
}

// Clothing product class
class Clothing extends Product implements Taxable {

    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.20; // 20% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.05; // 5% GST
    }

    @Override
    public String getTaxDetails() {
        return "Clothing Tax: 5% GST";
    }
}

// Groceries product class (no tax)
class Groceries extends Product {

    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05; // 5% discount
    }
}

public class ECommercePlatform{  // main class

    public static void printFinalPrices(ArrayList<Product> products){    // Method to process products using polymorphism

        for (Product product : products){
            double price = product.getPrice();
            double discount = product.calculateDiscount();
            double tax = 0;

            // Check if product is taxable
            if(product instanceof Taxable){
                tax = ((Taxable) product).calculateTax();
            }

            double finalPrice = price + tax - discount;

            System.out.println("Product Name : " + product.getName());
            System.out.println("Base Price  : " + price);
            System.out.println("Discount    : " + discount);
            System.out.println("Tax         : " + tax);
            System.out.println("Final Price : " + finalPrice);
            System.out.println("----------------------------");
        }
    }

    public static void main(String[] args) {

        ArrayList<Product> productList = new ArrayList<>();

        productList.add(new Electronics(101, "Laptop", 60000));
        productList.add(new Clothing(102, "Jacket", 3000));
        productList.add(new Groceries(103, "Rice Bag", 1200));

        // Polymorphic method call
        printFinalPrices(productList);
    }

}
