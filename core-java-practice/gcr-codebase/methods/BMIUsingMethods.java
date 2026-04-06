import java.util.*;
public class BMIUsingMethods {
	
	// Method to calculate BMI and fill 3rd column
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100.0; // convert cm to meter
            double bmi = weight / (heightM * heightM);
            data[i][2] = bmi;
        }
    }
    
    // Method to return BMI statuses as a string array
    public static String[] getBMIStatus(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 double[][] persons = new double[10][3];
	        System.out.println("Enter Weight (kg) and Height (cm) for 10 persons:");
	        for (int i = 0; i < persons.length; i++) {
	            System.out.println("\nPerson " + (i + 1));
	            System.out.print("Weight (kg): ");
	            persons[i][0] = sc.nextDouble();
	            System.out.print("Height (cm): ");
	            persons[i][1] = sc.nextDouble();
	        }
	        calculateBMI(persons);
	        String[] status = getBMIStatus(persons);
	        System.out.println("\n--------------------------------------------------");
	        System.out.println("   Weight(kg)   Height(cm)     BMI        Status");
	        System.out.println("--------------------------------------------------");

	        for (int i = 0; i < persons.length; i++) {
	            System.out.printf("%10.2f %12.2f %12.2f   %s\n", persons[i][0], persons[i][1], persons[i][2], status[i]);
	        }
	        System.out.println("--------------------------------------------------");
	}

}
