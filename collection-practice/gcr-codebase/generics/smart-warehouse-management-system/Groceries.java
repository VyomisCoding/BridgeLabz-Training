public class Groceries extends WarehouseItem{
    private String expiryDate;
    public Groceries(String name, double price, String expiryDate){
        super(name, price);
        this.expiryDate = expiryDate;
    }
    @Override
    public void displayDetails(){
        System.out.println("Grocery Item: " + getName() + ", Price: INR" + getPrice() + ", Expiry Date: " + expiryDate);
    }
    
}
