class Student{
    public Student(){
        System.out.println("Student object created!");
    }
}

public class DynamicObjectCreation{
    public static void main(String[] args) throws Exception{
        Class<?> cls = Class.forName("Student");      // Step 1: Load the Student class
        Object obj = cls.getDeclaredConstructor().newInstance(); // Step 2: Create object dynamically (no new keyword)
        System.out.println("Object created of type: " + obj.getClass().getName());  // Step 3: Show class name to confirm
    }
}
