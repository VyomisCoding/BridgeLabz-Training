import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Banking System");
        System.out.println("1. Savings Account");
        System.out.println("2. Checking Account");
        System.out.print("Choose Account Type: ");
        int choice = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Account Number: ");
        String accNo = sc.nextLine();
        System.out.print("Enter Balance: ");
        double balance = sc.nextDouble();
        BankAccount account;
        if(choice == 1){
            account = new SavingsAccount(accNo, balance);
        }else{
            account = new CheckingAccount(accNo, balance);
        }
        System.out.printf("Transaction Fee: %.2f%n", account.calculateFee());     // Polymorphic call
    }
}
