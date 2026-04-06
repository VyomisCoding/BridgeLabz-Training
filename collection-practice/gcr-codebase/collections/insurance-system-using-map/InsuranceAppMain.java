import java.time.LocalDate;
import java.util.*;

public class InsuranceAppMain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PolicyManager manager = new PolicyManager();
        System.out.print("Enter number of policies to add: ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){      //Input Policies------------------------------------------------------------

            System.out.println("\nEnter Policy Details:");
            System.out.print("Policy Number: ");
            String number = sc.nextLine();
            System.out.print("Policyholder Name: ");
            String holder = sc.nextLine();
            System.out.print("Expiry Date (YYYY-MM-DD): ");
            LocalDate expiry = LocalDate.parse(sc.nextLine());
            System.out.print("Coverage Type: ");
            String coverage = sc.nextLine();
            System.out.print("Premium Amount: ");
            double premium = sc.nextDouble();
            sc.nextLine();
            
            Policy p = new Policy(number, holder, expiry, coverage, premium);
            manager.addPolicy(p);
        }

        while(true){           // --- Menu ---------------------------------------------------------------------

            System.out.println("\n--MENU--");
            System.out.println("1. Retrieve Policy by Number");
            System.out.println("2. List Policies Expiring in 30 Days");
            System.out.println("3. List Policies by Policyholder");
            System.out.println("4. Remove Expired Policies");
            System.out.println("5. Show All Policies (Insertion Order)");
            System.out.println("6. Show Policies Sorted by Expiry");
            System.out.println("7. EXIT");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            sc.nextLine();
            switch(ch){
                case 1:
                    System.out.print("Enter Policy Number: ");
                    String num = sc.nextLine();
                    System.out.println(manager.getPolicyByNumber(num));
                    break;
                case 2:
                    System.out.println("\nPolicies expiring in 30 days:");
                    System.out.println(manager.getPoliciesExpiringIn30Days());
                    break;
                case 3:
                    System.out.print("Enter Holder Name: ");
                    String h = sc.nextLine();
                    System.out.println(manager.getPoliciesByHolder(h));
                    break;
                case 4:
                    manager.removeExpiredPolicies();
                    System.out.println("Expired Policies Removed.");
                    break;
                case 5:
                    manager.displayAll();
                    break;
                case 6:
                    manager.displaySortedByExpiry();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
