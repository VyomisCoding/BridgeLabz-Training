
// Queue Interface

import java.util.*;

public class QueueReversing{
    static void reverse(Queue<Integer> q){
        if (q.isEmpty()) return;
        int x = q.remove();   // remove first
        reverse(q);           // recursive call
        q.add(x);             // add at last
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter queue elements:");
        for (int i=0;i<n;i++) q.add(sc.nextInt());
        
        reverse(q);
        System.out.println("Reversed Queue: " + q);
    }

    
}
