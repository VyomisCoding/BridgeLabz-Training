import java.util.*;

interface Insurable{
    double calculateInsurance();
    String getInsuranceDetails();
}

// abstract vehicle class
abstract class Vehicle{
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate){
        this.vehicleNumber=vehicleNumber;
        this.type=type;
        this.rentalRate=rentalRate;
    }

    public abstract double calculateRentalCost(int days);

    public double getRentalRate(){
        return rentalRate;
    }

    public void displayDetails(){
        System.out.println("Vehicle No. :" + vehicleNumber);
        System.out.println("Type: " + type);
    }
}

// Car class
class Car extends Vehicle implements Insurable {

    public Car(String vehicleNumber, double rate) {
        super(vehicleNumber, "Car", rate);
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance() {
        return 500;
    }

    public String getInsuranceDetails() {
        return "Car Insurance";
    }
}

// Bike class
class Bike extends Vehicle implements Insurable {

    public Bike(String vehicleNumber, double rate) {
        super(vehicleNumber, "Bike", rate);
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance() {
        return 200;
    }

    public String getInsuranceDetails() {
        return "Bike Insurance";
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("UP32AB1234", 1500));
        vehicles.add(new Bike("UP32CD5678", 500));

        for (Vehicle v : vehicles) {
            v.displayDetails();
            System.out.println("Rental Cost : " + v.calculateRentalCost(3));

            if (v instanceof Insurable) {
                System.out.println("Insurance   : " +
                        ((Insurable) v).calculateInsurance());
            }
            System.out.println("---------------------");
        }
    }
}
