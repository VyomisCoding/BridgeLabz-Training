import java.util.*;
public class TriangularPark {
	
	public static double roundsNeeded(double a, double b, double c) {
        double perimeter = a + b + c;
        double distanceToRunInMeters = 5000;
        return distanceToRunInMeters / perimeter;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter side 1 of the triangle: ");
        double side1 = sc.nextDouble();

        System.out.print("Enter side 2 of the triangle: ");
        double side2 = sc.nextDouble();

        System.out.print("Enter side 3 of the triangle: ");
        double side3 = sc.nextDouble();

        double rounds = roundsNeeded(side1, side2, side3);

        System.out.println("The athlete must complete " + rounds + " rounds to finish 5000m.");
	}

}
