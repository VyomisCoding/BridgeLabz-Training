
import java.util.Scanner;

public class CalculateTheBMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight in kilograms: ");
        double weight = sc.nextDouble();
        System.out.println("Enter height in centimeters: ");
        double heightincm = sc.nextDouble();
        double heightInMeters = heightincm / 100;
        double bmi = weight / (heightInMeters * heightInMeters);
        System.out.println("Your BMI is: " + bmi);
        if (bmi <= 18.4) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Normal weight");
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
