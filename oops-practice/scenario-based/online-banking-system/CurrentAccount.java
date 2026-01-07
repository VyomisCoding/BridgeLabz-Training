// Current Account with different interest logic
class CurrentAccount extends Account {

    CurrentAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    // Polymorphism
    public double calculateInterest() {
        return balance * 0.02; // 2% interest
    }
}
