public class VehicleQueue{
    private String[] queue;
    private int front, rear, size;
    VehicleQueue(int capacity){
        queue = new String[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(String vehicle){  // Enqueue
        if(size == queue.length){
            System.out.println(" Queue Overflow! Vehicle waiting denied");
            return;
        }
        rear = (rear + 1) % queue.length;
        queue[rear] = vehicle;
        size++;
        System.out.println("⏳ Vehicle waiting: " + vehicle);
    }
    
    public String dequeue(){  // Dequeue
        if(size == 0){
            System.out.println("🚫 Queue Underflow! No vehicles waiting");
            return null;
        }
        String vehicle = queue[front];
        front = (front + 1) % queue.length;
        size--;
        return vehicle;
    }
    public boolean isEmpty(){
        return size == 0;
    }
}
