import java.util.*;
public class BasicCalulatorUsingBuiltInFunctions{
	static double add(double a, double b) { return a + b; }
    static double subtract(double a, double b) { return a - b; }
    static double multiply(double a, double b) { return a * b; }
    static double divide(double a, double b) { return a / b; }
    

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double x = sc.nextDouble();
        System.out.print("Enter second number: ");
        double y = sc.nextDouble();

        System.out.println("1.Add  2.Subtract  3.Multiply  4.Divide");
        System.out.print("Choose operation: ");
        int op = sc.nextInt();

        switch (op) {
            case 1: System.out.println("Result: " + add(x, y)); break;
            case 2: System.out.println("Result: " + subtract(x, y)); break;
            case 3: System.out.println("Result: " + multiply(x, y)); break;
            case 4: System.out.println("Result: " + divide(x, y)); break;
            default: System.out.println("Invalid choice");
        }

	}

}
