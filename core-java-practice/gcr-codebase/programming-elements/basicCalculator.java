import java.util.Scanner;
public class basicCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1=sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2=sc.nextDouble();
        double sum=num1+num2;
        double difference=num1-num2;
        double product=num1*num2;
        double quotient=num1/num2;
        // Rounding results using inbuilt function
        sum = Math.round(sum * 100.0) / 100.0;
        difference = Math.round(difference * 100.0) / 100.0;
        product = Math.round(product * 100.0) / 100.0;
        quotient = Math.round(quotient * 100.0) / 100.0;

        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+ num1 + " and " + num2 + " is "+ sum + ", " + difference + ", "+ product + ", and " + quotient);
    }
}
