
//Hybrid Inheritance : Vehicle Management System 

class Vehicle{
    int maxSpeed;
    String model;
    Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
}

interface Refuelable{  // Interface Refuelable
    void refuel();
}

class ElectricVehicle extends Vehicle{  // ElectricVehicle subclass
    ElectricVehicle(int speed, String model) {
        super(speed, model);
    }
    void charge() {
        System.out.println(model + " is charging");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable{   // PetrolVehicle subclass implementing interface
    PetrolVehicle(int speed, String model) {
        super(speed, model);
    }
    public void refuel() {
        System.out.println(model + " is refueling with petrol");
    }
}

public class VehicleManagementSystem {
    public static void main(String[] args){
        ElectricVehicle ev = new ElectricVehicle(150, "Tesla");
        PetrolVehicle pv = new PetrolVehicle(180, "Honda City");
        ev.charge();
        pv.refuel();
    }
}
