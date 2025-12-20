
import java.util.Scanner;


public class BMIFitnessTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the client's weight (in kilograms): ");
        double weightInKg = sc.nextDouble();
        System.out.print("Enter the client's height (in meters): ");
        double heightInMeters = sc.nextDouble();

        // method for calculating BMI:
        double bmiValue = calculateBMI(weightInKg, heightInMeters);

        // method for displaying BMI result:
        displayBMIResult(bmiValue);
    }
    // Method to calculate BMI
    static double calculateBMI(double weight, double height) {
        return weight / Math.pow(height, 2);
    }

    // Method to decide and print BMI category
    static void displayBMIResult(double bmi) {
        System.out.println("\nBMI Value: " + Math.round(bmi * 100.0) / 100.0);
        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } 
        else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Category: Normal");
        } 
        else {
            System.out.println("Category: Overweight");
        }
    }
}
