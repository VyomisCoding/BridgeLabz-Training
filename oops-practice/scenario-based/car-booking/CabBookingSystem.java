
import java.util.*;

interface FareCalculator{   // Interface for fare calculation
    double calculateFare(double distance);
}

class NormalFare implements FareCalculator{  // Normal pricing
    public double calculateFare(double distance){
        return distance * 10;       // ₹10 per km
    }
}

class PeakFare implements FareCalculator{    // Peak pricing (polymorphism)
    public double calculateFare(double distance){
        return distance * 15;   // ₹15 per km
    }
}

public class CabBookingSystem {
    static List<Driver> drivers = new ArrayList<>();
    static List<Ride> rideHistory = new ArrayList<>();

    static Driver assignDriver() throws NoDriverAvailableException{     // Method to assign available driver
        for (Driver d : drivers) {
            if (d.available) {
                d.available = false;
                return d;
            }
        }
        throw new NoDriverAvailableException("No drivers available at the moment.");
    }

    static void bookRide(User user, double distance, FareCalculator calculator) throws NoDriverAvailableException{    // Method to book a ride

        Driver driver = assignDriver();
        double fare = calculator.calculateFare(distance);
        Ride ride = new Ride(user, driver, distance, fare);
        rideHistory.add(ride);
        System.out.println("\nRide Booked Successfully!");
        ride.displayRide();
    }

    static void displayRideHistory(){     // Display ride history
        System.out.println("\nRide History:");
        for (Ride r : rideHistory) {
            r.displayRide();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        drivers.add(new Driver("Amit"));           // Adding drivers
        drivers.add(new Driver("Rohit"));

        try {
            System.out.print("Enter user name: ");   // Create user
            User user = new User(sc.nextLine());

            System.out.print("Enter distance (km): ");
            double distance = sc.nextDouble();

            System.out.print("Is it peak time? (true/false): ");
            boolean isPeak = sc.nextBoolean();

            FareCalculator calculator;    // Polymorphism in action
            if (isPeak) {
                calculator = new PeakFare();
            } else {
                calculator = new NormalFare();
            }

            bookRide(user, distance, calculator);   // Book ride

            displayRideHistory();    // Show history

        } catch (NoDriverAvailableException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

