import java.time.LocalDate;
import java.util.*;

public class InsuranceSetAppMain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PolicySetManager manager = new PolicySetManager();
        PerformanceChecker checker = new PerformanceChecker();
        System.out.print("Enter number of policies: ");
        int n = sc.nextInt();
        sc.nextLine();
        List<Policy> inputList = new ArrayList<>();

        for(int i=0;i<n;i++){                                 // INPUT POLICIES
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
            inputList.add(p);
            manager.addPolicy(p);
        }
        while(true){                                          // MENU
            System.out.println("\n--MENU--");
            System.out.println("1. Show All Unique Policies");
            System.out.println("2. Policies Expiring in Next 30 Days");
            System.out.println("3. Policies by Coverage Type");
            System.out.println("4. Detect Duplicate Policies");
            System.out.println("5. Show Policies in Insertion Order");
            System.out.println("6. Show Policies Sorted by Expiry");
            System.out.println("7. Compare Performance");
            System.out.println("8. EXIT");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            sc.nextLine();
            switch(ch){
                case 1:
                    System.out.println(manager.getAllUniquePolicies());
                    break;
                case 2:
                    System.out.println(manager.getPoliciesExpiringIn30Days());
                    break;
                case 3:
                    System.out.print("Enter Coverage Type: ");
                    String cov = sc.nextLine();
                    System.out.println(manager.getPoliciesByCoverage(cov));
                    break;
                case 4:
                    System.out.println("Duplicate Policies: " + manager.detectDuplicatePolicies(inputList));
                    break;
                case 5:
                    System.out.println(manager.getInsertionOrderPolicies());
                    break;
                case 6:
                    System.out.println(manager.getSortedPolicies());
                    break;
                case 7:
                    checker.checkPerformance();
                    break;
                case 8:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
