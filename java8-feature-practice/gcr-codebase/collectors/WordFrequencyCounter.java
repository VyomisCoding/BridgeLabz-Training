import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
public class WordFrequencyCounter {
    public static void main(String[] args) {
        String paragraph = "java is great and java is powerful";
        Map<String,Integer> freq = Arrays.stream(paragraph.split(" ")).collect(Collectors.toMap(word -> word, word -> 1, Integer::sum));
        System.out.println(freq);
    }
}
