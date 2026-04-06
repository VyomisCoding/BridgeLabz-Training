// circular linked list to simulate vehicles on a roundabout

public class Roundabout{
    private VehicleNode head = null;

    public void addVehicle(String vehicleNumber){
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
        System.out.println("Entered Roundabout"+vehicleNumber);
    }

    public void removeVehicle(String vehicleNumber){ // Remove Vehicle from Roundabout
        if(head == null){
            System.out.println("Roundabout Empty");
            return;
        }
        VehicleNode curr = head;
        VehicleNode prev = null;

        do{
            if(curr.number.equals(vehicleNumber)){
                if(curr == head && curr.next == head){
                    head = null;
                }
                else if(curr == head){    // removing head
                    VehicleNode temp = head;
                    while(temp.next != head){
                        temp=temp.next;
                    }
                    head=head.next;
                    temp.next = head;
                }else{
                    prev.next = curr.next;
                }
                System.out.println("Exited Roundabout: " + vehicleNumber);
                return;
            } 
            prev = curr;
            curr=curr.next;

        }while(curr!=head);
        System.out.println("Vehicle Not found");
    }

    public void printRoundabout(){
        if(head == null){
            System.out.println("Roundabout Empty");
            return;
        }
        System.out.println("Vehicles");
        VehicleNode temp = head;
        do{
            System.out.print(temp.number+"->");
            temp=temp.next;
        }while(temp != head);
        System.out.println("Back to start");
    }
}
