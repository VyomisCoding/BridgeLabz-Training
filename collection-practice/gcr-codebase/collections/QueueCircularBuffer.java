
//Queue Interface

import java.util.*;

public class QueueCircularBuffer{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter buffer size: ");
        int size = sc.nextInt();
        int[] buffer = new int[size];
        int index = 0;
        System.out.print("Enter number of items to insert: ");
        int n = sc.nextInt();
        System.out.println("Enter items:");
        for(int i=0;i<n;i++){
            int val = sc.nextInt();
            buffer[index] = val;          // overwrite if full
            index = (index + 1) % size;
        }
        System.out.println("Final Buffer:");
        System.out.println(Arrays.toString(buffer));
    }
    
}
