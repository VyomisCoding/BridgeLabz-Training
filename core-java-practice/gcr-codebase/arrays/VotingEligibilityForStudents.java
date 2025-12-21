import java.util.*;

public class VotingEligibilityForStudents {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] studentsAge = new int[10];
        System.out.println("Enter the age of 10 students:");
        for(int i=0; i<10; i++) {
        for (int i = 0; i < studentsAge.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            studentsAge[i] = sc.nextInt();
        }
        System.out.println("Students eligible to vote (age 18 or older):");
        for(int age : studentsAge) {
            if(age >= 18) {
                System.out.println(age);

        System.out.println("Voting Eligibility Result");
        for (int age : studentsAge) {// Checking voting eligibility
            if (age < 0) {
                System.out.println("Invalid age entered.");
            } else if (age >= 18) {
                System.out.println("The student with age " + age + " can vote.");
            } else {
                System.out.println("The student with age " + age + " cannot vote.");
            }
        }

    }
}
