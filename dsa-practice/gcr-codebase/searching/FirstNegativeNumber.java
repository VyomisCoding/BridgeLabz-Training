//Linear Search Problem 1: Search for the First Negative Number

import java.util.*;
public class FirstNegativeNumber{
    public static int findFirstNegative(int[] arr){
        for(int i=0;i < arr.length;i++){
            if(arr[i] < 0){
                return i;  // return index of first negative
            }
        }
        return -1;         // no negative found
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
        int result = findFirstNegative(arr);
        System.out.println("First Negative Index: " + result);
    }
}
