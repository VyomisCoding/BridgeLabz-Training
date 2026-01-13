import java.util.ArrayList;

class Wallet {
    User user;
    private double balance;
    private ArrayList<Transaction> transactions = new ArrayList<>();

    Wallet(User user) {
        this.user = user;
        this.balance = 0;
    }

    public double getBalance() {
        return balance;
    }

    public void addMoney(double amount) {
        balance += amount;
        transactions.add(new Transaction("ADD", amount));
        System.out.println("💰 Money added: ₹" + amount);
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient wallet balance");
        }
        balance -= amount;
        transactions.add(new Transaction("WITHDRAW", amount));
        System.out.println("💸 Money withdrawn: ₹" + amount);
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public void showTransactions() {
        System.out.println("\n📜 Transaction History:");
        for (Transaction t : transactions) {
            System.out.println(t.type + " → ₹" + t.amount);
        }
    }
}
