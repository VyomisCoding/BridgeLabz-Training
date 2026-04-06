// COUNTING SORT :-

import java.util.*;
public class StudentAges{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[] ages = new int[n];
        System.out.println("Enter students' ages (10 to 18):");
        for(int i=0;i<n;i++){
            ages[i] = sc.nextInt();
        }
        int minAge = 10;         // Age range is fixed from 10 to 18
        int maxAge = 18;
        int range = maxAge - minAge + 1;
        int[] count = new int[range];      // Step 1: Create count array
        for (int i=0;i<n;i++){             // Store frequency of each age
            count[ages[i] - minAge]++;
        }
        for(int i=1;i<range;i++){      // Step 2: Modify count array to store cumulative frequency
            count[i] = count[i] + count[i - 1];
        }
        int[] output = new int[n];     // Step 3: Create output array
        for(int i=n-1;i>=0;i--){      // Place elements in correct position (stable sorting)
            int age = ages[i];
            int position = count[age - minAge] - 1;
            output[position] = age;
            count[age - minAge]--;
        }
        for(int i=0;i<n;i++){     // Copy sorted elements back to original array
            ages[i] = output[i];
        }
        System.out.println("Sorted Students' Ages (Ascending Order):");
        for (int i = 0; i < n; i++) {
            System.out.print(ages[i] + " ");
        }
    }
}
