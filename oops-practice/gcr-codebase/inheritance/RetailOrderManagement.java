
// Multilevel Inheritance : Online Retail Order Management


class Order{
    int orderId;
    String orderDate;

    Order(int orderId, String orderDate){
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus(){   // Method to return order status
        return "Order Placed";
    }
}

class ShippedOrder extends Order{  // Subclass ShippedOrder extends Order
    String trackingNumber;
    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    String getOrderStatus(){
        return "Order Shipped";
    }
}

class DeliveredOrder extends ShippedOrder{   // Subclass DeliveredOrder extends ShippedOrder
    String deliveryDate;
    DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }
    String getOrderStatus(){
        return "Order Delivered";
    }
}

public class RetailOrderManagement{
    public static void main(String[] args) {
        DeliveredOrder order = new DeliveredOrder(101, "10-08-2025", "TRK789", "15-08-2025");
        System.out.println("Order Status: " + order.getOrderStatus());
    }
}
