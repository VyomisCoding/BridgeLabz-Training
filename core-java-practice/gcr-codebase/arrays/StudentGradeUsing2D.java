import java.util.Scanner;
public class StudentGradeUsing2D {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // 2D array for marks [student][subject]
        double[][] marks = new double[n][3];
        double[] percentage = new double[n];
        char[] grade = new char[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));

            for (int j = 0; j < 3; j++) {
                if (j == 0)
                    System.out.print("Physics marks: ");
                else if (j == 1)
                    System.out.print("Chemistry marks: ");
                else
                    System.out.print("Maths marks: ");

                marks[i][j] = sc.nextDouble();

                if (marks[i][j] < 0) {
                    System.out.println("Invalid marks, enter again");
                    j--; // repeat subject
                }
            }
        }
        for (int i = 0; i < n; i++) {// calculate percentage and grade
            double total = 0;
            for (int j = 0; j < 3; j++) {
                total += marks[i][j];
            }
            percentage[i] = total / 3;
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
