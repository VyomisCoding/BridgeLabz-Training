import java.util.Scanner;

class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;

    void getAccountDetails(Scanner sc) {
        System.out.print("Enter Account Holder Name: ");
        accountHolder = sc.nextLine();

        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        balance = sc.nextDouble();
        sc.nextLine();
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        displayBalance();
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw amount is : " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
        displayBalance();
    }

    void displayBalance() {
        System.out.println("Current balance: " + balance);
    }
}
public class SimulateAnATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount();
        acc.getAccountDetails(sc);
        acc.displayBalance();
        acc.deposit(200);
        acc.withdraw(100);
        acc.withdraw(1000);
    }
}
