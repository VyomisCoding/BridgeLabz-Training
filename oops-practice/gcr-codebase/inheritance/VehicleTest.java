// Superclass Vehicle
class Vehicle {
    int maxSpeed;
    String fuelType;

    Vehicle(int maxSpeed, String fuelType){   // Constructor to initialize vehicle details
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    void displayInfo(){  // Method to display basic vehicle information
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Car extends Vehicle{    // Car class inherits Vehicle
    int seatCapacity;

    Car(int speed, String fuel, int seats) {
        super(speed, fuel);
        seatCapacity = seats;
    }

    void displayInfo(){    // Overriding method to add car-specific details
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}

class Truck extends Vehicle{    // Truck class inherits Vehicle
    int loadCapacity;

    Truck(int speed, String fuel, int load) {
        super(speed, fuel);
        loadCapacity = load;
    }

    void displayInfo(){   // Overriding displayInfo for truck
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}

class Motorcycle extends Vehicle{   // Motorcycle class inherits Vehicle
    Motorcycle(int speed, String fuel) {
        super(speed, fuel);
    }

    void displayInfo(){    // Overriding displayInfo for motorcycle
        super.displayInfo();
        System.out.println("Type: Two Wheeler");
    }
}

public class VehicleTest{
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];   // Vehicle array storing different subclass objects
        vehicles[0] = new Car(180, "Petrol", 5);
        vehicles[1] = new Truck(120, "Diesel", 15);
        vehicles[2] = new Motorcycle(150, "Petrol");

        for (Vehicle v : vehicles){   // Polymorphism: method call depends on object type
            v.displayInfo();
            System.out.println("\n");
        }
    }
}
