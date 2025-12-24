import java.util.*;
public class TrigoFunctions {
	
	public double[] calculateTrigonometricFunctions(double angle) {

        double radianValue = Math.toRadians(angle);

        double sinValue = Math.sin(radianValue);
        double cosValue = Math.cos(radianValue);
        double tanValue = Math.tan(radianValue);

        return new double[]{sinValue, cosValue, tanValue};
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TrigoFunctions tool = new TrigoFunctions();

        System.out.print("Enter angle in degrees: ");
        double degree = sc.nextDouble();

        double[] output = tool.calculateTrigonometricFunctions(degree);

        System.out.println("Sine     : " + output[0]);
        System.out.println("Cosine   : " + output[1]);
        System.out.println("Tangent  : " + output[2]);
	}
}
