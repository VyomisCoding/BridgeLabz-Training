import java.util.*;
public class CollineartyCheck {
	
	// Method 1: Check using slope formula------------------------------------------------------------------------------------------------------
    public static boolean isCollinearSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        // slope AB = (y2 - y1)/(x2 - x1)
        // slope BC = (y3 - y2)/(x3 - x2)
        // slope AC = (y3 - y1)/(x3 - x1)
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);
        return slopeAB == slopeBC && slopeAB == slopeAC;
    }
 
    // Method 2: Check using area of triangle formula-------------------------------------------------------------------------------------------
    public static boolean isCollinearArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        // area = 0.5 * ( x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2) )
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;  // area zero → points are collinear
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter coordinates of 3 points:");
        System.out.print("x1: "); double x1 = sc.nextDouble();
        System.out.print("y1: "); double y1 = sc.nextDouble();
        
        System.out.print("x2: "); double x2 = sc.nextDouble();
        System.out.print("y2: "); double y2 = sc.nextDouble();
        
        System.out.print("x3: "); double x3 = sc.nextDouble();
        System.out.print("y3: "); double y3 = sc.nextDouble();

        boolean viaSlope = isCollinearSlope(x1, y1, x2, y2, x3, y3);
        boolean viaArea  = isCollinearArea(x1, y1, x2, y2, x3, y3);

        System.out.println("\n--- Collinearity Check ---");
        System.out.println("Using Slope Method: " + (viaSlope ? "Collinear" : "Not Collinear"));
        System.out.println("Using Area Method : " + (viaArea  ? "Collinear" : "Not Collinear"));

	}

}
