import java.util.*;
public class EuclideanDistance {
	
	public static double findDistance(double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }

    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        return new double[]{m, b};
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        double dist = findDistance(x1, y1, x2, y2);
        System.out.println("Distance = " + dist);
        double[] eq = findLineEquation(x1, y1, x2, y2);
        System.out.println("Slope (m) = " + eq[0]);
        System.out.println("Y-intercept (b) = " + eq[1]);
        System.out.println("Line Equation:  y = " + eq[0] + "x + " + eq[1]);
    }

}
