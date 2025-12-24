import java.util.*;
public class UnitConverter {
	
	//KM to MILES | METERS to FEET -----------------------------------------------------------------------------------------------------------------
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }
    
    //YARDS to FEET | METERS to INCHES | INCHES to CM---------------------------------------------------------------------------------------------
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }
    
    //TEMPERATURE | WEIGHT | VOLUME----------------------------------------------------------------------------------------------------------------
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    public static double convertKilogramsToPounds(double kg) {
        double kilograms2pounds = 2.20462;
        return kg * kilograms2pounds;
    }

    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }
    
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }
    
	public static void main(String[] args) {// main method---------===============-------------============================----------------------=====
		Scanner sc = new Scanner(System.in);
		while (true) {
            System.out.println("\n--- UNIT CONVERTOR ---");
            System.out.println("1. Km → Miles");
            System.out.println("2. Miles → Km");
            System.out.println("3. Meters → Feet");
            System.out.println("4. Feet → Meters");
            System.out.println("5. Yards → Feet");
            System.out.println("6. Feet → Yards");
            System.out.println("7. Meters → Inches");
            System.out.println("8. Inches → Meters");
            System.out.println("9. Inches → Centimeters");
            System.out.println("10. Fahrenheit → Celsius");
            System.out.println("11. Celsius → Fahrenheit");
            System.out.println("12. Pounds → Kilograms");
            System.out.println("13. Kilograms → Pounds");
            System.out.println("14. Gallons → Liters");
            System.out.println("15. Liters → Gallons");
            System.out.println("0. Exit");
            System.out.print("Choose your option: ");
            
            int choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("Exiting...");
                break;
            }

            System.out.print("Enter value to convert: ");
            double value = sc.nextDouble();

            switch (choice) {
            case 1 -> System.out.println("Miles = " + convertKmToMiles(value));
            case 2 -> System.out.println("Kilometers = " + convertMilesToKm(value));
            case 3 -> System.out.println("Feet = " + convertMetersToFeet(value));
            case 4 -> System.out.println("Meters = " + convertFeetToMeters(value));
            case 5 -> System.out.println("Feet = " + convertYardsToFeet(value));
            case 6 -> System.out.println("Yards = " + convertFeetToYards(value));
            case 7 -> System.out.println("Inches = " + convertMetersToInches(value));
            case 8 -> System.out.println("Meters = " + convertInchesToMeters(value));
            case 9 -> System.out.println("Centimeters = " + convertInchesToCentimeters(value));
            case 10 -> System.out.println("Celsius = " + convertFahrenheitToCelsius(value));
            case 11 -> System.out.println("Fahrenheit = " + convertCelsiusToFahrenheit(value));
            case 12 -> System.out.println("Kilograms = " + convertPoundsToKilograms(value));
            case 13 -> System.out.println("Pounds = " + convertKilogramsToPounds(value));
            case 14 -> System.out.println("Liters = " + convertGallonsToLiters(value));
            case 15 -> System.out.println("Gallons = " + convertLitersToGallons(value));

            default -> System.out.println("Invalid choice! Try again.");
        }
    }
	}

}
