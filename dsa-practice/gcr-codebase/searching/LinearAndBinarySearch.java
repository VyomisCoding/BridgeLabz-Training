// You are given a list of integers. 
// Write a program that uses Linear Search to find the first missing positive integer 
// in the list and Binary Search to find the index of a given target number.


import java.util.*;
public class LinearAndBinarySearch{ 
    public static int firstMissingPositive(int[] arr){   // Finding first missing positive through Linear Search
        int n = arr.length;   
        for(int i=0;i<n;i++){   // Ignore numbers <=0 or >n by replacing them with 1 placeholder
            if(arr[i] <= 0 || arr[i] > n){
                arr[i] = 1;
            }
        }
        for(int i=0;i<n;i++){    //Mark visited numbers by negating values at their index position
            int index = Math.abs(arr[i]);
            if(index < n && arr[index] > 0){
                arr[index] = -arr[index]; // mark as visited
            }
        }
        for(int i=1;i<n;i++){    // Step 3: First index having positive value = missing positive number
            if(arr[i] > 0){
                return i; // 'i' is missing
            }
        }
        return n;     // If none missing in [1..n-1], answer is n
    }
    
    public static int binarySearch(int[] arr, int target){    // BINARY SEARCH AFTER SORTING
        int left = 0, right = arr.length - 1;
        while(left <= right){
            int mid = (left + right)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return -1;  // target not found
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.println("Enter array elements: ");
        for (int i=0;i<num;i++){
            arr[i] = sc.nextInt();
        }
        int[] tempArr = Arrays.copyOf(arr, num);   // Copy array because marking will modify it
        
        int missing = firstMissingPositive(tempArr);    // First Missing Positive Integer
        System.out.println("First Missing Positive Integer: " + missing);
        
        System.out.print("Enter target to search after sorting: ");   // Part 2: Binary Search for Target
        int target = sc.nextInt();
        Arrays.sort(arr);      // sort array before binary search
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        int index = binarySearch(arr, target);
        if(index != -1)
            System.out.println("Target found at index: " + index);
        else
            System.out.println("Target not found (-1)");
    }
}
