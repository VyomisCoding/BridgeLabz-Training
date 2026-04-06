import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        CheckoutQueue counter = new CheckoutQueue();
        counter.addItemData("apple", 50, 10);                  // Preload items
        counter.addItemData("milk", 30, 5);
        counter.addItemData("bread", 25, 3);
        int choice;
        do{
            System.out.println("\n🛒 Supermarket Billing");
            System.out.println("1. Add Customer");
            System.out.println("2. Process Next Customer");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            
            switch(choice){
                case 1:
                    System.out.print("Customer name: ");
                    String name = sc.nextLine();
                    Customer c = new Customer(name);
                    System.out.print("How many items? ");
                    int count = sc.nextInt();
                    sc.nextLine();
                    for(int i=0;i<count;i++){
                        System.out.print("Enter item: ");
                        c.addItem(sc.nextLine());
                    }
                    counter.addCustomer(c);
                    break;
                case 2:
                    counter.processNextCustomer();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(choice != 3);
    }
}
