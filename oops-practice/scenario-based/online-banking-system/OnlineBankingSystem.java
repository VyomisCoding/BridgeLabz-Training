class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// Abstraction using interface
interface BankService {
    void deposit(double amount);
    void withdraw(double amount) throws InsufficientBalanceException;
    double calculateInterest();
}

public class OnlineBankingSystem{
    public static void main(String[] args) {

        Account acc1 = new SavingsAccount(101, 5000);     // Account creation
        Account acc2 = new CurrentAccount(102, 3000);

        System.out.println("Savings Balance: " + acc1.getBalance());   // Balance check
        System.out.println("Current Balance: " + acc2.getBalance());

        Thread t1 = new TransferFunds(acc1, acc2, 1000);    // Concurrent fund transfer using threads
        Thread t2 = new TransferFunds(acc1, acc2, 2000);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }

        System.out.println("\nFinal Balances:");    // Final balances
        System.out.println("Savings: " + acc1.getBalance());
        System.out.println("Current: " + acc2.getBalance());

        System.out.println("\nSavings Interest: " + acc1.calculateInterest());   // Interest calculation (polymorphism)
        System.out.println("Current Interest: " + acc2.calculateInterest());

        acc1.showTransactions();   // Transaction history
        acc2.showTransactions();
    }
    
}
