// Queue for vehicles waiting to enter

public class VehicleQueue{
    private String[] arr;
    private int front , rear,size;

    public VehicleQueue(int capacity){
        arr = new String[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(String vehicle){    // insert vehicles
        if(size == arr.length){
            System.out.println("Queue Overflow"+vehicle);
            return;
        }
        rear = (rear+1) % arr.length;
        arr[rear] = vehicle;
        size++;
        System.out.println("Waiting"+vehicle);
    }

    public String dequeue(){      // Remove vehicle
        if(size == 0){
            System.out.println("Queue Underflow");
            return null;
        }
        String val = arr[front];
        front = (front + 1) % arr.length;
        size--;
        return val;
    }

    public boolean isEmpty(){
        return size == 0;
    }
}
