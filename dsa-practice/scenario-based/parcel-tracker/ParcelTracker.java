public class ParcelTracker{
    private StageNode head;
    public ParcelTracker(){
        head = new StageNode("Packed");
        head.next = new StageNode("Shipped");
        head.next.next = new StageNode("In Transit");
        head.next.next.next = new StageNode("Delivered");
    }

    public void addCheckpoint(String after, String newStage){
        StageNode temp = head;
        while(temp != null){
            if (temp.stage.equalsIgnoreCase(after)){
                StageNode node = new StageNode(newStage);
                node.next = temp.next;
                temp.next = node;
                System.out.println("Added checkpoint");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Stage not found");
    }

    public void track(){
        StageNode temp = head;
        System.out.println("Parcel Status:");
        while(temp != null){
            System.out.println("->" + temp.stage);
            temp = temp.next;
        }
    }

    public void simulateLost(){
        head.next.next = null;
        System.out.println("Parcel lost!");
    }
}
