import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ParcelTracker tracker = new ParcelTracker();
        int choice;
        do{
            System.out.println("\nParcel Menu");
            System.out.println("1. Track Parcel");
            System.out.println("2. Add Checkpoint");
            System.out.println("3. Simulate Lost Parcel");
            System.out.println("4. Exit");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    tracker.track();
                    break;
                case 2:
                    System.out.print("After Stage: ");
                    String after = sc.nextLine();
                    System.out.print("New Stage: ");
                    tracker.addCheckpoint(after, sc.nextLine());
                    break;
                case 3:
                    tracker.simulateLost();
                    break;
            }
        }while(choice != 4);
    }
}
