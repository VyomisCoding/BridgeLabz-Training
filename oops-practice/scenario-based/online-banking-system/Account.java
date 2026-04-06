import java.util.*;

abstract class Account implements BankService{     // Base Account class
    protected int accountNumber;
    protected double balance;
    protected List<String> transactions = new ArrayList<>();

    Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        transactions.add("Account created with balance: " + balance);
    }

    public synchronized void deposit(double amount){    // Synchronized deposit for thread safety
        balance += amount;
        transactions.add("Deposited: " + amount);
    }

    public synchronized void withdraw(double amount)    // Synchronized withdraw for thread safety
            throws InsufficientBalanceException {

        if (balance < amount) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        balance -= amount;
        transactions.add("Withdrawn: " + amount);
    }

    public double getBalance(){    // Balance check
        return balance;
    }

    public void showTransactions(){     // Display transaction history
        System.out.println("\nTransaction History:");
        for (String t : transactions) {
            System.out.println(t);
        }
    }
}