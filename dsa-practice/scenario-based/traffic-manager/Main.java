public class Main{
    public static void main(String[] args) {
        Roundabout roundabout = new Roundabout();
        VehicleQueue queue = new VehicleQueue(3);

        queue.enqueue("CAR-101");
        queue.enqueue("CAR-102");
        queue.enqueue("CAR-103");
        queue.enqueue("CAR-104"); // overflow
        
        while(!queue.isEmpty()){     // Move queue → roundabout
            roundabout.addVehicle(queue.dequeue());
        }
        roundabout.printRoundabout();
        // Remove cars
        roundabout.removeVehicle("CAR-102");   // Remove cars
        roundabout.printRoundabout();
    }
}
