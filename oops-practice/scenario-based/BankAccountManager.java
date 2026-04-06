public class BankAccountManager{

    private String accountNumber;// Fields
    private double balance;

    public BankAccountManager(String accountNumber, double balance){   // Constructor
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount){   // Deposit money
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount){   // Withdraw money with overdraft check
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        } else if (amount > balance) {
            System.out.println("Insufficient balance! Withdrawal denied.");
        } else {
            balance -= amount;
            System.out.println("Amount Withdrawn: " + amount);
        }
    }

    public void checkBalance(){   // Check balance
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args){  // Main method

        BankAccountManager account = new BankAccountManager("ACC101", 5000);

        account.checkBalance();
        account.deposit(2000);
        account.withdraw(1000);
        account.withdraw(7000); // overdraft case
        account.checkBalance();
    }
    
}
