// Binary Search Problem 2: Find the Peak Element in an Array

import java.util.*;
public class FindPeakElement{
    public static int findPeak(int[] arr){
        int left = 0, right = arr.length - 1;
        while(left < right){
            int mid =(left + right)/2;      
            if(arr[mid] < arr[mid + 1]){    // If mid < mid+1 → peak is on right
                left = mid + 1;
            }else{ 
                right = mid;               // peak is on left side including mid
            }
        }
        return left; // index of peak
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        int peakIndex = findPeak(arr);
        System.out.println("Peak Element Index: " + peakIndex);
    }
}
