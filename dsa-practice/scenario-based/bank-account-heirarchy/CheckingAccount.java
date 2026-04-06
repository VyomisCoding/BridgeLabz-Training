public class CheckingAccount extends BankAccount{     // Checking account with conditional flat fee
    public CheckingAccount(String accountNumber, double balance){
        super(accountNumber, balance);
    }
    
    @Override
    public double calculateFee(){    // Fee = ₹1.0 if balance < 1000, else 0
        return getBalance() < 1000 ? 1.0 : 0.0;
    }
}
