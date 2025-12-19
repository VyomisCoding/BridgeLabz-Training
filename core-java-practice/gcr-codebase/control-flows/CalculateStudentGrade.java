
import java.util.Scanner;

public class CalculateStudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input marks
        System.out.print("Enter Physics marks: ");
        double physics = sc.nextDouble();
        System.out.print("Enter Chemistry marks: ");
        double chemistry = sc.nextDouble();
        System.out.print("Enter Maths marks: ");
        double maths = sc.nextDouble();
        double average = (physics + chemistry + maths) / 3;
        System.out.printf("Average Percentage of Student is:", average);
        // Determine grade
        if (average >= 80) {
            System.out.println("Grade: A");
            System.out.println("Remarks: Level 4, above agency-normalized standards");
        } else if (average >= 70 && average <= 79) {
            System.out.println("Grade: B");
            System.out.println("Remarks: Level 3, at agency-normalized standards");
        } else if (average >= 60 && average <= 69) {
            System.out.println("Grade: C");
            System.out.println("Remarks: Level 2, below but approaching standards");
        } else if (average >= 50 && average <= 59) {
            System.out.println("Grade: D");
            System.out.println("Remarks: Level 1, well below standards");
        } else if (average >= 40 && average <= 49) {
            System.out.println("Grade: E");
            System.out.println("Remarks: Level 1, too below standards");
        } else {
            System.out.println("Grade: R");
            System.out.println("Remarks: Remedial standards");
        }
    }
}
