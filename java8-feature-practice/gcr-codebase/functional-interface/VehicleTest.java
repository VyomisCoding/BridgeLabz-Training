interface VehicleDashboard {

    void displaySpeed(int speed);

    // Default method for new feature
    default void displayBattery(int percent) {
        System.out.println("Battery: " + percent + "%");
    }
}

class Car implements VehicleDashboard {
    public void displaySpeed(int speed) {
        System.out.println("Car Speed: " + speed + " km/h");
    }
    // Car does not override displayBattery() → uses default
}

class ElectricBike implements VehicleDashboard {
    public void displaySpeed(int speed) {
        System.out.println("E-Bike Speed: " + speed + " km/h");
    }
    @Override
    public void displayBattery(int percent) {
        System.out.println("E-Bike Battery Level: " + percent + "%");
    }
}

public class VehicleTest{
    public static void main(String[] args){
        VehicleDashboard car = new Car();
        VehicleDashboard eBike = new ElectricBike();
        car.displaySpeed(80);
        car.displayBattery(0); // default (ignored battery feature)
        eBike.displaySpeed(40);
        eBike.displayBattery(85); // overridden
    }
}
