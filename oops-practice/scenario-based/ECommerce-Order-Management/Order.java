public class Order{
    int orderId;
    Product product;
    Customer customer;
    String status;

    Order(int orderId, Product product, Customer customer){
        this.orderId = orderId;
        this.product = product;
        this.customer = customer;
        this.status = "PLACED";
    }
    void cancelOrder(){
        status = "CANCELLED";
        System.out.println(" Order Cancelled");
    }
    void trackOrder(){
        System.out.println(" Order Status: " + status);
    }
}
