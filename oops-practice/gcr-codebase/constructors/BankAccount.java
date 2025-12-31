public class BankAccount{
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    void setBalance(double b) {
        balance = b;
    }

    double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    void display() {
        System.out.println(accountNumber + " - " + accountHolder);
    }
}
