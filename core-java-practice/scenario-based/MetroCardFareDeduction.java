import java.util.*;
public class MetroCardFareDeduction {
	private static int getFare(int dist) { // method for getting fare
        return (dist <= 5) ? 10 : (dist <= 15 ? 20 : 30);
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double balance;

        System.out.print("Enter your Metro Smart Card balance: ");
        balance = sc.nextDouble();

        System.out.println("--- Metro Fare Deduction Started ---");
        System.out.println("Type -1 as distance anytime to exit.\n");

        while (balance > 0) {
            System.out.print("Enter distance you travelled (in km): ");
            int distance = sc.nextInt();
            if (distance == -1) {
                System.out.println("You chose to exit.");
                break;
            }
            if (distance <= 0) {
                System.out.println("Distance cannot be zero or negative.\n");
                continue;
            }
            int fare = getFare(distance);
            if (fare > balance) {
                System.out.println("Not enough balance left for this trip.");
                break;
            }
            balance -= fare;
            System.out.println("Fare deducted: ₹" + fare);
            System.out.println("Remaining Card Balance: ₹" + balance + "\n");
        }

        System.out.println("\n--- Session Ended ---");
        System.out.println("Final Balance: ₹" + balance);

	}

}
