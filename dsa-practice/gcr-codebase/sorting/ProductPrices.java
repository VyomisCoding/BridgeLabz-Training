// QUICK SORT :- 

import java.util.*;
public class ProductPrices{
    static void quickSort(int[] arr, int low, int high){      // Method to perform Quick Sort
        if(low < high){      // If there are at least two elements to sort
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }
    static int partition(int[] arr, int low, int high){     // Partition method (using last element as pivot)
        int pivot = arr[high];           // Choose last element as pivot
        int i = low - 1;                 // Index of smaller element
        for (int j=low;j<high; j++){     // Traverse and rearrange elements
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1; 
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        int[] prices = new int[n];
        System.out.println("Enter product prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        quickSort(prices, 0, n - 1);
        System.out.println("Sorted Product Prices (Ascending Order):");
        for (int i = 0; i < n; i++) {
            System.out.print(prices[i] + " ");
        }
    }
}
