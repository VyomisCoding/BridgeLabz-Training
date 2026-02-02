import java.lang.reflect.Method;
import java.util.Scanner;

class MathOperations{
    public int add(int a, int b){
        return a + b;
    }
    public int subtract(int a, int b){
        return a - b;
    }
    public int multiply(int a, int b){
        return a * b;
    }
}

public class DynamicMethodInvocation{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter method name (add / subtract / multiply): ");
        String methodName = sc.nextLine();
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        MathOperations obj = new MathOperations();   // Step 1: Create object of MathOperations
        Method method = MathOperations.class.getMethod(methodName, int.class, int.class);   // Step 2: Get method based on user input
        Object result = method.invoke(obj, a, b);    // Step 3: Invoke method dynamically    
        System.out.println("Result: " + result);
    }
}
