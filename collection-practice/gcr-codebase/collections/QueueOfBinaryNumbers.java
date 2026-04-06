
// Queue Interface

import java.util.*;
public class QueueOfBinaryNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        Queue<String> q = new LinkedList<>();
        q.add("1");
        System.out.println("Binary Numbers:");
        for(int i=0;i<n;i++){
            String s = q.remove();
            System.out.print(s + " ");
            q.add(s + "0");
            q.add(s + "1");
        }
    }
}
