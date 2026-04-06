class CardPayment implements Payment{
    public void pay(double amount) throws PaymentFailedException{
        if (amount > 50000){
            throw new PaymentFailedException("Card limit exceeded");
        }
        System.out.println("💳 Card Payment Successful: ₹" + amount);
    }
}
