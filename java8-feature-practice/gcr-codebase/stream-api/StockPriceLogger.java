import java.util.Arrays;
import java.util.List;

public class StockPriceLogger{
    public static void main(String[] args){
        List<Double> stockPrices = Arrays.asList(101.5, 102.8, 100.9, 103.4, 104.2);
        System.out.println("Live Stock Price Updates:");
        stockPrices.forEach(price -> System.out.println("Stock Price: " + price + " USD"));
    }
}
