
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();
        Student[] arr = new Student[n];
        for(int i=0;i<n;i++){
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Marks: ");
            int marks = sc.nextInt(); 
            sc.nextLine();
            arr[i] = new Student(name, marks);
        }
        MergeSortRanker sorter = new MergeSortRanker();
        sorter.mergeSort(arr, 0, n - 1);
        System.out.println("\n Final Rank List (Descending Marks):");
        for(int i=0;i<n;i++){
            System.out.println((i + 1) + ". " + arr[i].name + " - " + arr[i].marks);
        }
    }    
}
