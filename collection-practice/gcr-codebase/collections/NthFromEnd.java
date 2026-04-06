import java.util.*;

public class NthFromEnd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            list.add(sc.nextLine());
        }
        System.out.print("Enter N: ");
        int k = sc.nextInt();
        int slow = 0, fast = 0;      // Two pointer approach
        while(fast < k){             // Move fast pointer k steps ahead
            fast++;
        }
        while(fast < list.size()){   // Move both pointers until fast reaches end
            fast++;
            slow++;
        }
        System.out.println("Nth element from end: " + list.get(slow));
    }
}
