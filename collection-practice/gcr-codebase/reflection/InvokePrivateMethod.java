import java.lang.reflect.Method;

class Calculator{
    private int multiply(int a, int b){
        return a * b;
    }
}

public class InvokePrivateMethod{
    public static void main(String[] args) throws Exception{
        Calculator calc = new Calculator();
        Method m = Calculator.class.getDeclaredMethod("multiply", int.class, int.class);    // Step 1: get the private method multiply(int, int)
        m.setAccessible(true);                        // Step 2: allow access to private method 
        int result = (int) m.invoke(calc, 6, 7);   // Step 3: invoke method using reflection
        System.out.println("Result of private multiply(): " + result);
    }
}
