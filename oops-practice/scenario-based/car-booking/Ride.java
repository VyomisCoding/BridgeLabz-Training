public class Ride{
    User user;
    Driver driver;
    double distance;
    double fare;

    Ride(User user, Driver driver, double distance, double fare) {
        this.user = user;
        this.driver = driver;
        this.distance = distance;
        this.fare = fare;
    }

    void displayRide() {
        System.out.println( "User: " + user.name + ", Driver: " + driver.name + ", Distance: " + distance + " km" + ", Fare: INR " + fare);
    }
}
