import java.util.Arrays;
import java.util.List;

public class SensorReadings{
    public static void main(String[] args){
        List<Integer> readings = Arrays.asList(45, 67, 82, 29, 91, 55);
        int threshold = 60;
        System.out.println("Sensor Readings Above Threshold:");
        readings.stream()
                .filter(value -> value > threshold)
                .forEach(value ->
                        System.out.println("Alert: Reading = " + value)
                );
    }
}
