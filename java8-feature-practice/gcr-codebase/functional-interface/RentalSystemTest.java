// Interface
interface Vehicle {
    void rent();
    void returnVehicle();
}

// Car Class
class Car implements Vehicle {
    public void rent() {
        System.out.println("Car has been rented.");
    }
    public void returnVehicle() {
        System.out.println("Car returned successfully.");
    }
}

// Bike Class
class Bike implements Vehicle {
    public void rent() {
        System.out.println("Bike has been rented.");
    }
    public void returnVehicle() {
        System.out.println("Bike returned successfully.");
    }
}

// Bus Class
class Bus implements Vehicle {
    public void rent() {
        System.out.println("Bus has been rented.");
    }
    public void returnVehicle() {
        System.out.println("Bus returned successfully.");
    }
}

public class RentalSystemTest {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        Vehicle bus = new Bus();

        car.rent();
        bike.rent();
        bus.rent();

        car.returnVehicle();
        bike.returnVehicle();
        bus.returnVehicle();
    }
}
