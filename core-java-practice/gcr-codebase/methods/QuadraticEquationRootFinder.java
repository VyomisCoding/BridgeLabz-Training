import java.util.*;
public class QuadraticEquationRootFinder {
	
	public static double[] findRoots(double a, double b, double c) {
        double delta = (b * b) - (4 * a * c);
        if (delta < 0) return new double[0];  // No real roots

        if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        }
        double sqrtDelta = Math.sqrt(delta);
        double r1 = (-b + sqrtDelta) / (2 * a);
        double r2 = (-b - sqrtDelta) / (2 * a);

        return new double[]{r1, r2};
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();

        double[] roots = findRoots(a, b, c);
        if (roots.length == 0) {
            System.out.println("No real roots");
        } else if (roots.length == 1) {
            System.out.println("Single Root = " + roots[0]);
        } else {
            System.out.println("Root 1 = " + roots[0]);
            System.out.println("Root 2 = " + roots[1]);
        }
	}

}
