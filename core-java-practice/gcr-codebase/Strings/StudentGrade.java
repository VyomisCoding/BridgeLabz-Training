import java.util.*;
public class StudentGrade {
	
    static int[][] getMarks(int n) {// Generate random marks for Physics, Chemistry, Maths
        int[][] arr = new int[n][3];

        for (int i = 0; i < n; i++) {
            arr[i][0] = 50 + (int)(Math.random() * 51);
            arr[i][1] = 50 + (int)(Math.random() * 51);
            arr[i][2] = 50 + (int)(Math.random() * 51);
        }
        return arr;
    }
    
    // Calculate total, average and percentage
    static double[][] calculate(int[][] marks) {

        double[][] data = new double[marks.length][3];

        for (int i = 0; i < marks.length; i++) {

            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3.0;
            double per = (total * 100.0) / 300;

            avg = Math.round(avg * 100) / 100.0;
            per = Math.round(per * 100) / 100.0;

            data[i][0] = total;
            data[i][1] = avg;
            data[i][2] = per;
        }
        return data;
    }
    
    static String[] findGrade(double[][] info) {

        String[] g = new String[info.length];

        for (int i = 0; i < info.length; i++) {

            double p = info[i][2];

            if (p >= 80)
                g[i] = "A";
            else if (p >= 70)
                g[i] = "B";
            else if (p >= 60)
                g[i] = "C";
            else if (p >= 50)
                g[i] = "D";
            else if (p >= 40)
                g[i] = "E";
            else
                g[i] = "R";
        }
        return g;
    }
    
    // Display result
    static void show(int[][] m, double[][] d, String[] g) {

        System.out.println("\nNo  P   C   M   Total  Avg   %   Grade");
        System.out.println("--------------------------------------");

        for (int i = 0; i < m.length; i++) {
            System.out.println((i + 1) + "   " + m[i][0] + "  " + m[i][1] + "  " + m[i][2] + "   " + (int)d[i][0] + "   " + d[i][1] + "  " + d[i][2] + "   " + g[i]);
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[][] marks = getMarks(n);
        double[][] details = calculate(marks);
        String[] grades = findGrade(details);

        show(marks, details, grades);
	}
}
