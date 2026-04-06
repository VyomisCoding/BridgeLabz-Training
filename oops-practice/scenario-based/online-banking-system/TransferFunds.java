public class TransferFunds extends Thread{    // Thread class for fund transfer
    private Account from; 
    private Account to;
    private double amount;

    TransferFunds(Account from, Account to, double amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    public void run() {
        try {
            synchronized (Account.class) { // ensures safe transfer
                from.withdraw(amount);
                to.deposit(amount);
                System.out.println("Transferred " + amount + " successfully.");
            }
        } catch (InsufficientBalanceException e) {
            System.out.println("Transfer failed: " + e.getMessage());
        }
    }
}