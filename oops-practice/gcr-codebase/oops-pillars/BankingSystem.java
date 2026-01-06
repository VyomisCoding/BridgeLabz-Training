interface Loanable {
    void applyForLoan();
    double calculateLoanEligibility();
}

// Abstract BankAccount
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    protected double balance;

    public BankAccount(String accNo, String name, double balance) {
        this.accountNumber = accNo;
        this.holderName = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public abstract double calculateInterest();
}

// Savings Account
class SavingsAccount extends BankAccount implements Loanable {

    public SavingsAccount(String accNo, String name, double bal) {
        super(accNo, name, bal);
    }

    public double calculateInterest() {
        return balance * 0.04;
    }

    public void applyForLoan() {
        System.out.println("Loan applied for Savings Account");
    }

    public double calculateLoanEligibility() {
        return balance * 5;
    }
}


// Current Account
class CurrentAccount extends BankAccount {

    public CurrentAccount(String accNo, String name, double bal) {
        super(accNo, name, bal);
    }

    public double calculateInterest() {
        return balance * 0.02;
    }
}

public class BankingSystem{
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount("101", "Amit", 50000);
        BankAccount acc2 = new CurrentAccount("102", "Neha", 80000);
        System.out.println(acc1.calculateInterest());
        System.out.println(acc2.calculateInterest());
    }
}
