import java.lang.reflect.Field;

class Person{                  // Person class with private field
    private int age = 20;
}

public class AccessPrivateField{
    public static void main(String[] args) throws Exception{
        Person p = new Person();
        Field ageField = Person.class.getDeclaredField("age");  // Step 1: Get private field "age"
        ageField.setAccessible(true);                           // Step 2: Allow access to private field
        System.out.println("Original Age: " + ageField.get(p));      // Step 3: Read original value
        ageField.set(p, 45);                                   // Step 4: Modify private field
        System.out.println("Modified Age: " + ageField.get(p));        // Step 5: Read modified value
    }
}
