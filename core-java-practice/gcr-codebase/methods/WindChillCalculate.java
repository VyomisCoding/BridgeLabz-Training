import java.util.*;
public class WindChillCalculate {
	
	public double calculateWindChill(double temperature, double windSpeed) {
        double factor = Math.pow(windSpeed, 0.16);
        double windChill = 35.74 + 0.6215 * temperature 
                           + (0.4275 * temperature - 35.75) * factor;
        return windChill;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        WindChillCalculate obj = new WindChillCalculate();

        System.out.print("Enter temperature in Fahrenheit: ");
        double temp = sc.nextDouble();
        System.out.print("Enter wind speed: ");
        double speed = sc.nextDouble();

        double result = obj.calculateWindChill(temp, speed);
        System.out.println("Wind Chill Temperature = " + result);

	}

}
