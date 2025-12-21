import java.util.Scanner;

public class BMIUsingArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[] height = new double[n];
        double[] weight = new double[n]; 
        double[] bmi = new double[n];
        String[] status = new String[n];
        // input height and weight
        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson " + (i + 1));
            System.out.print("Enter height (in meters): ");
            height[i] = sc.nextDouble();
            System.out.print("Enter weight (in kg): ");
            weight[i] = sc.nextDouble();

            if (height[i] <= 0 || weight[i] <= 0) {
                System.out.println("Invalid input, enter again");
                i--; // repeat same person
                continue;
            }
        }
        for (int i = 0; i < n; i++) {// calculate BMI and status
            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] <= 18.4)
                status[i] = "Underweight";
            else if (bmi[i] <= 24.9)
                status[i] = "Normal";
            else if (bmi[i] <= 39.9)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }
        System.out.println("BMI Report");
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + " | Height: " + height[i] + " | Weight: " + weight[i] + " | BMI: " + bmi[i] + " | Status: " + status[i]);
        }
    }
}
