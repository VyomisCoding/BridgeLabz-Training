
import java.util.Scanner;

public class DoubleOperation {
    static void performDoubleOperations(double num1, double num2, double num3) {
        double value1 = num1 + num2 * num3;
        double value2 = num1 * num2 + num3;   
        double value3 = num3 + (num1 / num2); 
        double value4 = Math.IEEEremainder(num1, num2) + num3;

        System.err.println("The results of Double Operations are: "+value1+", "+value2+", "+value3+", "+value4);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: "); 
        double num1 = sc.nextDouble();
        System.out.print("Enter the value of b: ");
        double num2 = sc.nextDouble();
        System.out.print("Enter the value of c: ");
        double num3 = sc.nextDouble();
        performDoubleOperations(num1, num2, num3);
    }
}
