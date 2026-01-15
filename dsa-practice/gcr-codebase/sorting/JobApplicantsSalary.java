// HEAP SORT :-


import java.util.*;
public class JobApplicantsSalary{
    static void heapSort(int[] arr, int n){
        for (int i= n/2-1;i>=0;i--){      // Build Max Heap Start from last non-leaf node and heapify each node
            heapify(arr, n, i);
        }
        for(int i=n-1;i>0;i--){        // Extract elements one by one from heap
            int temp = arr[0];         // Move current root (largest) to end
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);      // Call heapify on reduced heap
        }
    }
    static void heapify(int[] arr, int heapSize, int root){    // Heapify method to maintain Max Heap property
        int largest = root;            
        int left = 2 * root + 1;       
        int right = 2 * root + 2;      
        if(left < heapSize && arr[left] > arr[largest]){      // If left child is larger than root
            largest = left;
        }
        if(right < heapSize && arr[right] > arr[largest]){    // If right child is larger than largest so far
            largest = right;
        }
        if(largest != root){        // If largest is not root
            int temp = arr[root];
            arr[root] = arr[largest];
            arr[largest] = temp;
            heapify(arr, heapSize, largest);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of job applications: ");
        int n = sc.nextInt();
        int[] salaries = new int[n];
        System.out.println("Enter expected salary demands:");
        for(int i = 0; i < n; i++){
            salaries[i] = sc.nextInt();
        }
        heapSort(salaries, n);
        System.out.println("Sorted Salary Demands (Ascending Order):");
        for(int i = 0; i < n; i++){
            System.out.print(salaries[i] + " ");
        }
    }
}
