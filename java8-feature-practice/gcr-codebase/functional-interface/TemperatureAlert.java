import java.util.function.Predicate;

public class TemperatureAlert {
    public static void main(String[] args) {

        double threshold = 40.0;

        // Predicate to check temperature
        Predicate<Double> isHighTemp = temp -> temp > threshold;

        double currentTemp = 42.5;

        if(isHighTemp.test(currentTemp)){
            System.out.println("ALERT ❗ Temperature too high: " + currentTemp + "°C");
        }else{
            System.out.println("Temperature normal: " + currentTemp + "°C");
        }
    }
}
