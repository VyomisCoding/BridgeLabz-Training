
// BUBBLE SORT :-

import java.util.*;

public class StudentMarks{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int num = sc.nextInt();
        int[] marks = new int[num];                        // Create array to store marks
        System.out.println("Enter the student marks:");     // Take marks input from user
        for(int i=0;i<num;i++){
            marks[i] = sc.nextInt();
        }
        for(int i=0;i<num-1;i++){                  // Bubble Sort Logic Outer loop runs n-1 times
            for (int j=0;j<num-1-i;j++){           // Inner loop for comparing adjacent elements
                if (marks[j] > marks[j + 1]){      // If current element is greater than next element, swap them
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted student marks (Ascending Order):");    // Display sorted marks
        for(int i=0;i<num;i++){
            System.out.print(marks[i] + " ");
        }
    }
}
