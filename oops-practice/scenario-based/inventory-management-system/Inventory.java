import java.util.ArrayList;

public class Inventory{
    private ArrayList<Product> products = new ArrayList<>();
    private AlertService alertService;
    private static final int LOW_STOCK_LIMIT = 5;

    Inventory(AlertService alertService){
        this.alertService = alertService;
    }

    public void addProduct(Product product){   // Add product
        products.add(product);
        System.out.println("Product added: " + product.getName());
    }

    public void updateStock(int productId, int quantity) throws OutOfStockException{   // Update stock
        for (Product p : products) {
            if (p.getProductId() == productId) {
                if (quantity < 0) {
                    throw new OutOfStockException("Stock cannot be negative");
                }
                p.setQuantity(quantity);
                System.out.println("🔄 Stock updated for " + p.getName());
                if (quantity <= LOW_STOCK_LIMIT) {
                    alertService.sendLowStockAlert(p);
                }
                return;
            }
        }
        System.out.println(" Product not found");
    }

    public void displayInventory(){   // Display inventory
        System.out.println("\n Inventory List:");
        for (Product p : products){
            System.out.println( p.getProductId() + " | " + p.getName() + " | Stock: " + p.getQuantity() );
        }
    }
}
