import java.util.*;

public class QueueUsingStack {
    Stack<Integer> in = new Stack<>();
    Stack<Integer> out = new Stack<>();
    
    public void enqueue(int x){  // Enqueue operation
        in.push(x);
        System.out.println(x + " enqueued into queue");
    }

    public void dequeue(){  // Dequeue operation
        if(out.isEmpty()){
            while(!in.isEmpty()){
                out.push(in.pop());
            }
        }
        if(out.isEmpty()){
            System.out.println("Queue is empty");
        }else{
            System.out.println("Dequeued element: " + out.pop());
        }
    }

    public void peek(){   // Peek operation
        if (out.isEmpty()){
            while (!in.isEmpty()){
                out.push(in.pop());
            }
        }
        if(out.isEmpty()){
            System.out.println("Queue is empty");
        }else{
            System.out.println("Front element: " + out.peek());
        }
    }

    public void isEmpty(){   // Check empty
        if(in.isEmpty() && out.isEmpty()){
            System.out.println("Queue is empty");
        }else{
            System.out.println("Queue is not empty");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        QueueUsingStack q = new QueueUsingStack();
        while(true){
            System.out.println("\n--- Queue Menu ---");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Is Empty");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter element: ");
                    int x = sc.nextInt();
                    q.enqueue(x);
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.peek();
                    break;
                case 4:
                    q.isEmpty();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
