import java.util.*;
public class BusRouteDistanceTracker {
	
    static double addDistance(double total, double stopDistance){ // method to add distance for every stop
        return total + stopDistance;
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double totalDistance = 0.0;
        int stopNumber = 1;

        while (true) {
            System.out.print("Enter distance added at stop " + stopNumber + " (in km): ");
            double distance = sc.nextDouble();

            totalDistance = addDistance(totalDistance, distance);

            System.out.println("Total distance so far: " + totalDistance + " km");

            System.out.print("Do you want to get off at this stop? (yes/no): ");
            sc.nextLine(); // clear buffer
            String choice = sc.nextLine().toLowerCase();

            if (choice.equals("yes")) {
                System.out.println("Passenger got off the bus.");
                break;
            }

            stopNumber++;
        }
        System.out.println("Final distance travelled: " + totalDistance + " km");
	}

}
