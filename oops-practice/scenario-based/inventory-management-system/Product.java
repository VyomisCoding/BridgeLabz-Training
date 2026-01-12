public class Product{
    private int productId;
    private String name;
    private int quantity;

    Product(int productId, String name, int quantity){
        this.productId = productId;
        this.name = name;
        this.quantity = quantity;
    }
    public int getProductId(){   // Encapsulation (Getters & Setter)
        return productId;
    }
    public String getName(){
        return name;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
}
