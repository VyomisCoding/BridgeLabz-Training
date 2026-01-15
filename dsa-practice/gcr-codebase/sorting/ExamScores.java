// SELECTION SORT

import java.util.*;

public class ExamScores{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int num = sc.nextInt();
        int[] scores = new int[num];
        System.out.println("Enter students' exam scores:");
        for(int i=0;i<num;i++){
            scores[i] = sc.nextInt();
        }
        for(int i=0;i<num - 1;i++){    // Selection Sort Logic :- Outer loop moves boundary of unsorted array
            int minIndex = i;          // Assume the minimum element is at index i

            for(int j=i+1;j<num;j++){      // Find the minimum element in remaining unsorted array
                if(scores[j] < scores[minIndex]){
                    minIndex = j;
                }
            }
            int temp = scores[minIndex];     // Swap the found minimum element with first unsorted element
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }
        System.out.println("Sorted Exam Scores (Ascending Order):");
        for(int i=0;i<num;i++) {
            System.out.print(scores[i] + " ");
        }
    }
}
