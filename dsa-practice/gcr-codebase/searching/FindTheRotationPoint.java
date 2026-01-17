//Binary Search Problem 1: Find the Rotation Point in a Rotated Sorted Array


import java.util.*;
public class FindTheRotationPoint{
    public static int findRotationPoint(int[] arr){
        int left = 0, right = arr.length - 1;
        while(left < right){
            int mid = (left + right) / 2;
            if(arr[mid] > arr[right]){   // If mid > last element → rotation is in right half
                left = mid + 1;
            }else{                       // rotation in left half including mid
                right = mid;
            }
        }
        return left; // index of smallest element
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of rotated array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter rotated sorted array elements:");
        for(int i=0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        int index = findRotationPoint(arr);
        System.out.println("Rotation Point Index: " + index);
    }
}
