public class Main{
    public static void main(String[] args){
        AlertService alertService = new EmailAlertService();
        Inventory inventory = new Inventory(alertService);

        Product p1 = new Product(101, "Laptop", 10);
        Product p2 = new Product(102, "Mouse", 3);

        inventory.addProduct(p1);
        inventory.addProduct(p2);
        inventory.displayInventory();
        try{
            inventory.updateStock(101, 4);  // Low stock alert
            inventory.updateStock(102, 0);  // Low stock alert
        }catch(OutOfStockException e){
            System.out.println("❌ " + e.getMessage());
        }
        inventory.displayInventory();
    }
}
