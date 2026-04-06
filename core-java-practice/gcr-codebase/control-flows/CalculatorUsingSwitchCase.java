
import java.util.Scanner;

public class CalculatorUsingSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double firstnum = sc.nextDouble();
        System.out.print("Enter second number: ");
        double secondnum = sc.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        String operator = sc.next();
        switch (operator) {
            case "+":
                System.out.println("Result: " + (firstnum + secondnum));
                break;
            case "-":
                System.out.println("Result: " + (firstnum - secondnum));
                break;
            case "*":
                System.out.println("Result: " + (firstnum * secondnum));
                break;
            case "/":
                if (secondnum != 0) {
                    System.out.println("Result: " + (firstnum / secondnum));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator!");
        }
    }
}
