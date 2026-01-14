// A deque is used to maintain indices of potential maximum elements, 
// ensuring each window maximum is found in linear time.

import java.util.*;

public class SlidingWindowMaximum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter window size k: ");
        int k = sc.nextInt();

        Deque<Integer> dq = new ArrayDeque<>();   // Deque to store indices of useful elements

        System.out.println("Maximum in each sliding window:");
         for(int i = 0; i < n; i++){
            if(!dq.isEmpty() && dq.peekFirst() <= i - k){   // Remove elements outside the current window
                dq.pollFirst();
            }
            while(!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]){    // Remove smaller elements from back because they cannot be maximum
                dq.pollLast();
            }
            dq.offerLast(i);   // Add current element index
            if (i >= k - 1){   // Print maximum for window when window size is reached
                System.out.print(arr[dq.peekFirst()] + " ");
            }
        }
    }
}
