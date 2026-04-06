public class Main{
    public static void main(String[] args){
        Product p1 = new Product(101, "Laptop", 45000);
        Customer c1 = new Customer(1, "Vyomesh");
        Order order = new Order(1001, p1, c1);
        Payment payment = new UPIPayment(); // Polymorphism
        try{
            payment.pay(p1.price);
            order.trackOrder();
        }catch (PaymentFailedException e){
            System.out.println("Payment Failed: " + e.getMessage());
        }
        order.cancelOrder();   // Cancel order example
        order.trackOrder();
    }
}
