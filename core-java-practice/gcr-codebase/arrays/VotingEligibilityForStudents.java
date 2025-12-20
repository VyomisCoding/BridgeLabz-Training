import java.util.*;

public class VotingEligibilityForStudents {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] studentsAge = new int[10];
        System.out.println("Enter the age of 10 students:");
        for(int i=0; i<10; i++) {
            studentsAge[i] = sc.nextInt();
        }
        System.out.println("Students eligible to vote (age 18 or older):");
        for(int age : studentsAge) {
            if(age >= 18) {
                System.out.println(age);
            }
        }

    }
}
