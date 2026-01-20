public abstract class BankAccount{         // Abstract base class for all bank accounts
    private final String accountNumber;    // Immutable core data
    private final double balance;
    public BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    public String getAccountNumber(){       // Getter methods (no setters to maintain immutability)
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
   
    public abstract double calculateFee();  // Polymorphic method
}
