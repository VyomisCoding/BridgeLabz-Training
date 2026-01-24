import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        AccountStore store = new AccountStore();
        WithdrawalQueue wq = new WithdrawalQueue();
        System.out.print("Enter number of customers: ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter account number and balance:");        //  Adding Accounts
        for(int i=0;i<n;i++){
            System.out.print("Account Number: ");
            String acc = sc.nextLine();
            System.out.print("Balance: ");
            int bal = sc.nextInt();
            sc.nextLine();
            store.addAccount(acc, bal);
        }
        System.out.print("\nEnter number of withdrawal requests: ");    // Withdrawal requests
        int m = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter account number and amount to withdraw:");
        for(int i=0;i<m;i++){
            System.out.print("Account Number: ");
            String acc = sc.nextLine();
            System.out.print("Amount: ");
            int amt = sc.nextInt();
            sc.nextLine();
            wq.addRequest(acc, amt);
        }
        System.out.println("\n--PROCESSING WITHDRAWAL REQUESTS--");     // Processing withdrawal queue
        Queue<String> q = wq.getQueue();
        while(!q.isEmpty()){
            String request = q.remove();
            String[] parts = request.split(" ");                    // Split into accNo and amount
            String accNo = parts[0];
            int amount = Integer.parseInt(parts[1]);
            if(!store.exists(accNo)){
                System.out.println("Account " + accNo + " does not exist! Request ignored.");
                continue;
            }
            boolean success = store.withdraw(accNo, amount);
            if(success){
                System.out.println("Withdrawal SUCCESS: " + accNo + " withdrew " + amount);
            }else{
                System.out.println("Withdrawal FAILED: " + accNo + " insufficient balance!");
            }
        }
        System.out.println("\n--ACCOUNTS (HashMap)--");                 // Final Results
        System.out.println(store.getAccounts());
        System.out.println("\n--ACCOUNTS SORTED BY BALANCE (TreeMap)--");
        System.out.println(store.getSortedAccounts());
    }
}
