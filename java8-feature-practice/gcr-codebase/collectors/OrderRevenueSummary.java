import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Order{
    String customer;
    double amount;
    Order(String customer, double amount){
        this.customer = customer;
        this.amount = amount;
    }
}

public class OrderRevenueSummary {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList( new Order("Amit", 1200.50), new Order("Amit", 799.00), new Order("Neha", 500.00), new Order("Rahul", 1500.00));
        Map<String, Double> revenue = orders.stream().collect(Collectors.groupingBy(o -> o.customer, Collectors.summingDouble(o -> o.amount)));
        System.out.println(revenue);
    }
}
