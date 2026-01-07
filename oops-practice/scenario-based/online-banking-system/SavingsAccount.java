
public class SavingsAccount extends Account{   // Savings Account with its own interest logic
    SavingsAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public double calculateInterest(){   // Polymorphism: different interest calculation
        return balance * 0.04;   // 4% interest
    }
}