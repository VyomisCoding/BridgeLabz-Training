// Compare the performance of Linear Search (O(N)) and Binary Search (O(log N)) on different dataset sizes.

import java.util.*;
public class CompareLinearAndBinarySearch{
    public static int linearSearch(int[] arr, int target){   // Linear Search
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target)
                return i;
        }
        return -1;
    }
    
    public static int binarySearch(int[] arr, int target){    // Binary Search
        int left = 0, right = arr.length - 1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(arr[mid] == target)
                return mid;
            else if(arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args){
        int N = 1_000_000;                   // dataset size
        int target = N - 1;                  // worst-case target
        int[] data = new int[N];
        for(int i=0;i<N;i++){                // Fill array
            data[i] = i;
        }
        long startLinear = System.nanoTime();    // Linear Search Timing
        linearSearch(data, target);
        long endLinear = System.nanoTime();
        Arrays.sort(data);                       // required for binary search
        long startBinary = System.nanoTime();    // Binary Search Timing
        binarySearch(data, target);
        long endBinary = System.nanoTime();
        double linearTime = (endLinear - startLinear) / 1_000_000.0;   // Convert to milliseconds
        double binaryTime = (endBinary - startBinary) / 1_000_000.0;
        System.out.println("Dataset Size: " + N);
        System.out.println("Linear Search Time: " + linearTime + " ms");
        System.out.println("Binary Search Time: " + binaryTime + " ms");
    }
}


    