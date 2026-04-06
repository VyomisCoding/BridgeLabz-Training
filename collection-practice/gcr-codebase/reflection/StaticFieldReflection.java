import java.lang.reflect.Field;

class Configuration {
    private static String API_KEY = "OLD-KEY-123";
}

public class StaticFieldReflection{
    public static void main(String[] args) throws Exception{
        Field field = Configuration.class.getDeclaredField("API_KEY");    // Step 1: Get the static field "API_KEY"
        field.setAccessible(true);                                        // Step 2: Allow access to private static field
        String originalValue = (String) field.get(null);                    // Step 3: Read original value (null because static field doesn't need instance)
        System.out.println("Original API_KEY: " + originalValue);
        field.set(null, "NEW-KEY-999");              // Step 4: Modify static field
        String modifiedValue = (String) field.get(null);    // Step 5: Read modified value
        System.out.println("Modified API_KEY: " + modifiedValue);
    }
}
