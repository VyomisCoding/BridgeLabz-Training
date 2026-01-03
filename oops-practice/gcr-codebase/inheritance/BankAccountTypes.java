
// Hierarichical inheritance : Bank Account Types with Savings and Checking Accounts

class BankAccount{    // Superclass BankAccount
    int accountNumber;
    double balance;

    BankAccount(int accountNumber, double balance){    // Constructor for common account details
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount{    // SavingsAccount inherits BankAccount
    double interestRate;
    SavingsAccount(int accNo, double bal, double interestRate) {
        super(accNo, bal);
        this.interestRate = interestRate;
    }
    void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount{   // CheckingAccount inherits BankAccount
    double withdrawalLimit;
    CheckingAccount(int accNo, double bal, double limit) {
        super(accNo, bal);
        this.withdrawalLimit = limit;
    }
    void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        System.out.println("Withdrawal Limit: " + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount{   // FixedDepositAccount inherits BankAccount
    int maturityPeriod;
    FixedDepositAccount(int accNo, double bal, int period) {
        super(accNo, bal);
        this.maturityPeriod = period;
    }

    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Maturity Period: " + maturityPeriod + " years");
    }
}


public class BankAccountTypes {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(101, 50000, 4.5);
        CheckingAccount ca = new CheckingAccount(102, 30000, 10000);
        FixedDepositAccount fd = new FixedDepositAccount(103, 100000, 5);

        sa.displayAccountType();
        System.out.println();

        ca.displayAccountType();
        System.out.println();

        fd.displayAccountType();
    }
}
