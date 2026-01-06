// GPS Interface
interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}

// Abstract Vehicle
abstract class RideVehicle {
    private String vehicleId;
    private String driverName;
    protected double ratePerKm;

    public RideVehicle(String id, String driver, double rate) {
        this.vehicleId = id;
        this.driverName = driver;
        this.ratePerKm = rate;
    }

    public abstract double calculateFare(double distance);
}

// Car Ride
class RideCar extends RideVehicle {

    public RideCar(String id, String driver) {
        super(id, driver, 15);
    }

    public double calculateFare(double distance) {
        return ratePerKm * distance;
    }
}


public class RideHailingApplication {
    public static void main(String[] args) {

        RideVehicle v = new RideCar("C101", "Rohit");
        System.out.println("Fare: " + v.calculateFare(10));
    }
}
