
// Insertion Sort :-

import java.util.*;
public class EmployeeIDs{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        int[] empIds = new int[n];

        System.out.println("Enter employee IDs:");
        for(int i=0;i<n;i++){
            empIds[i] = sc.nextInt();
        }
        for(int i=1;i<n;i++){        // Insertion Sort Logic Assume first element is already sorted
            int key = empIds[i];     // Current element to be inserted
            int j = i - 1;
            while(j >= 0 && empIds[j] > key){     // Shift elements of sorted part that are greater than key
                empIds[j + 1] = empIds[j];
                j--;
            }
            empIds[j + 1] = key;      // Insert the key at its correct position
        }
        System.out.println("Sorted Employee IDs (Ascending Order):");
        for (int i = 0; i < n; i++) {
            System.out.print(empIds[i] + " ");
        }
    }
}
