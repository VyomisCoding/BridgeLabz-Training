import java.util.*;
public class StudentGradeUsing1D {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // arrays for marks, percentage and grade
        double[] physicsMarks = new double[n];
        double[] chemistryMarks = new double[n];
        double[] mathsMarks = new double[n];
        double[] percentage = new double[n];
        char[] grade = new char[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.print("Physics marks: ");
            physicsMarks[i] = sc.nextDouble();
            System.out.print("Chemistry marks: ");
            chemistryMarks[i] = sc.nextDouble();
            System.out.print("Maths marks: ");
            mathsMarks[i] = sc.nextDouble();

            if (physicsMarks[i] < 0 || chemistryMarks[i] < 0 || mathsMarks[i] < 0) {
                System.out.println("Invalid marks, enter again");
                i--; // repeat same student
                continue;
            }
        }
        for (int i = 0; i < n; i++) {// calculating percentage and grade
            percentage[i] = (physicsMarks[i] + chemistryMarks[i] + mathsMarks[i]) / 3;

            if (percentage[i] >= 80)
                grade[i] = 'A';
            else if (percentage[i] >= 70)
                grade[i] = 'B';
            else if (percentage[i] >= 60)
                grade[i] = 'C';
            else if (percentage[i] >= 50)
                grade[i] = 'D';
            else if (percentage[i] >= 40)
                grade[i] = 'E';
            else
                grade[i] = 'R';
        }
        
        System.out.println("Student Result");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + " | Percentage: " + percentage[i] + " | Grade: " + grade[i]);
        }
        
	}
}
