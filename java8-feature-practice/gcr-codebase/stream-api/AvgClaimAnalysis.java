import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AvgClaimAnalysis{
    static class Claim{                 // POJO inside same class
        String type;
        double amount;

        Claim(String type, double amount){
            this.type = type;
            this.amount = amount;
        }

        public String getType() { return type; }
        public double getAmount() { return amount; }
    }

    public static void main(String[] args){
        List<Claim> claims = Arrays.asList(
                new Claim("Health", 20000),
                new Claim("Health", 15000),
                new Claim("Vehicle", 5000),
                new Claim("Vehicle", 7000),
                new Claim("Home", 30000)
        );

        Map<String, Double> avgClaim = claims.stream()
                .collect(Collectors.groupingBy(
                        Claim::getType,
                        Collectors.averagingDouble(Claim::getAmount)
                ));

        avgClaim.forEach((type, avg) ->
                System.out.println(type + " → Avg: " + avg));
    }
}
