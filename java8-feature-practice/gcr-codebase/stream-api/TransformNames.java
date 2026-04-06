import java.util.Arrays;
import java.util.List;

public class TransformNames{
    public static void main(String[] args){
        List<String> names = Arrays.asList("Vyomesh", "Amit", "Rohit", "Kiran", "Mohit");
        List<String> formattedNames = names.stream()
                .map(String::toUpperCase)    // convert to UPPERCASE
                .sorted()                    // sort A→Z
                .toList();

        formattedNames.forEach(System.out::println);
    }
}
