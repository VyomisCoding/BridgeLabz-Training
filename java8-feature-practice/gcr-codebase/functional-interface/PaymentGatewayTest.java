interface PaymentProcessor {

    void processPayment(double amount);
    default void refund(double amount){      // Default refund method so old providers don't break
        System.out.println("Refund of INR" + amount + " processed (default logic).");
    }
}

// Existing provider
class UPIProcessor implements PaymentProcessor{
    public void processPayment(double amount){
        System.out.println("Paid INR" + amount + " via UPI.");
    }
}

// New provider overriding refund()
class CreditCardProcessor implements PaymentProcessor{
    public void processPayment(double amount){
        System.out.println("Paid INR" + amount + " via Credit Card.");
    }

    @Override
    public void refund(double amount){
        System.out.println("Refund INR" + amount + " to Credit Card.");
    }
}

public class PaymentGatewayTest{
    public static void main(String[] args){
        PaymentProcessor upi = new UPIProcessor();
        PaymentProcessor card = new CreditCardProcessor();
        upi.processPayment(500);
        upi.refund(200);  // default used
        card.processPayment(1200);
        card.refund(300); // overridden
    }
}
