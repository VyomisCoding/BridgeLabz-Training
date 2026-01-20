public class SavingsAccount extends BankAccount{      // Savings account with percentage-based fee
    public SavingsAccount(String accountNumber, double balance){
        super(accountNumber, balance);
    }
    @Override
    public double calculateFee(){       // Fee = 0.5% of balance
        return getBalance() * 0.005;    // primitive double calculation (fast)
    }
}
