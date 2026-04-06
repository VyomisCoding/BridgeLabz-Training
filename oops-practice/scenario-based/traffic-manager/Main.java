public class Main{
    public static void main(String[] args){
        CircularRoundabout roundabout = new CircularRoundabout();
        VehicleQueue waitingQueue = new VehicleQueue(3);
        
        waitingQueue.enqueue("CAR-101");   // Vehicles arriving
        waitingQueue.enqueue("CAR-102");
        waitingQueue.enqueue("CAR-103");
        waitingQueue.enqueue("CAR-104");   // Overflow
        
        while(!waitingQueue.isEmpty()){   // Move vehicles from queue to roundabout
            String vehicle = waitingQueue.dequeue();
            roundabout.addVehicle(vehicle);
        }
        roundabout.printRoundabout();
        roundabout.removeVehicle("CAR-102");  // Exit vehicles
        roundabout.printRoundabout();
        roundabout.removeVehicle("CAR-999");  // Not present
    }
}
