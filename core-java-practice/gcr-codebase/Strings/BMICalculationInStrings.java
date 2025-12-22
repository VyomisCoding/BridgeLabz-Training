import java.util.*;
public class BMICalculationInStrings {
	
	static String[][] calculateBMI(double[][] data) {

        String[][] result = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {

            double weight = data[i][0];
            double heightCm = data[i][1];

            double heightM = heightCm / 100;
            double bmi = weight / (heightM * heightM);

            String status;

            if (bmi <= 18.4)
                status = "Underweight";
            else if (bmi <= 24.9)
                status = "Normal";
            else if (bmi <= 39.9)
                status = "Overweight";
            else
                status = "Obese";
            bmi = Math.round(bmi * 100) / 100.0;

            result[i][0] = String.valueOf(heightCm);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.valueOf(bmi);
            result[i][3] = status;
        }

        return result;
    }
	
	// method to display result
    static void display(String[][] arr) {
        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\tStatus");
        for (int i = 0; i < arr.length; i++) {
            System.out.println( arr[i][0] + "\t\t" + arr[i][1] + "\t\t" + arr[i][2] + "\t" + arr[i][3]);
        }
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double[][] input = new double[10][2];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            input[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            input[i][1] = sc.nextDouble();
        }
        String[][] bmiData = calculateBMI(input);
        display(bmiData);
		
	}
}
