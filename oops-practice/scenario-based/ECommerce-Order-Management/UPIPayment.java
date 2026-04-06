class UPIPayment implements Payment{
    public void pay(double amount){
        System.out.println("📱 UPI Payment Successful: ₹" + amount);
    }
}
