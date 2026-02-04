// Interface
interface Payment {
    void pay(double amount);
}

// UPI Class
class UPI implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via UPI.");
    }
}

// Credit Card Class
class CreditCard implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via Credit Card.");
    }
}

// Wallet Class
class Wallet implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via Wallet.");
    }
}

public class PaymentTest {
    public static void main(String[] args) {
        Payment upi = new UPI();
        Payment card = new CreditCard();
        Payment wallet = new Wallet();

        upi.pay(500);
        card.pay(1200);
        wallet.pay(300);
    }
}
