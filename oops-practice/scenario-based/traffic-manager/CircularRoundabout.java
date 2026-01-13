public class CircularRoundabout{
    private VehicleNode head = null;

    public void addVehicle(String vehicleNumber){   // Add vehicle to roundabout
        VehicleNode newNode = new VehicleNode(vehicleNumber);
        if(head == null){
            head = newNode;
            newNode.next = head;
        }else{
            VehicleNode temp = head;
            while(temp.next != head){
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
        System.out.println(" Vehicle entered roundabout: " + vehicleNumber);
    }

    public void removeVehicle(String vehicleNumber){   // Remove vehicle
        if (head == null) {
            System.out.println("Roundabout empty");
            return;
        }
        VehicleNode curr = head;
        VehicleNode prev = null;
        do{
            if(curr.vehicleNumber.equals(vehicleNumber)){
                if(curr == head && curr.next == head){
                    head = null;
                }else{
                    if(curr == head){
                        VehicleNode temp = head;
                        while(temp.next != head){
                            temp = temp.next;
                        }
                        head = head.next;
                        temp.next = head;
                    }else{
                        prev.next = curr.next;
                    }
                }
                System.out.println("Vehicle exited: " + vehicleNumber);
                return;
            }
            prev = curr;
            curr = curr.next;
        }while (curr != head);
        System.out.println("Vehicle not found");
    }

    public void printRoundabout(){  // Print roundabout state
        if(head == null){
            System.out.println("Roundabout is empty");
            return;
        }
        System.out.print("Roundabout Vehicles: ");
        VehicleNode temp = head;
        do{
            System.out.print(temp.vehicleNumber + " -> ");
            temp = temp.next;
        }while (temp != head);
        System.out.println("(back to start)");
    }
}
