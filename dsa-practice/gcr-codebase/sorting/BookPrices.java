// MERGE SORT :- 

import java.util.*;

public class BookPrices{
    static void mergeSort(int[] arr, int left, int right){       // Method to perform Merge Sort
        if(left < right){   // Base condition: if array has more than one element
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
    static void merge(int[] arr, int left, int mid, int right){      // Method to merge two sorted subarrays 
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0;
        int k = left;
        while(i < n1 && j < n2){     // Merge the temp arrays back into arr[]
            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while(i < n1){      // Copy remaining elements of L[], if any 
            arr[k] = L[i];
            i++;
            k++;
        }
        while(j < n2){     // Copy remaining elements of R[], if any
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        int[] prices = new int[n];
        System.out.println("Enter book prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        mergeSort(prices, 0, n - 1);
        System.out.println("Sorted Book Prices (Ascending Order):");
        for (int i = 0; i < n; i++) {
            System.out.print(prices[i] + " ");
        }
    }
}
