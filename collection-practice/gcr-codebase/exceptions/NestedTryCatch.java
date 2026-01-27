
import java.util.*;

public class NestedTryCatch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter index to access: ");
        int index = sc.nextInt();
        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();
        try{
            try{
                int value = arr[index];              // may throw ArrayIndexOutOfBoundsException
                try{
                    int result = value / divisor;    // may throw ArithmeticException
                    System.out.println("Result = " + result);
                }catch(ArithmeticException e){
                    System.out.println("Cannot divide by zero!");
                }
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Invalid array index!");
            }
        }finally{
            System.out.println("Nested try-catch completed.");
        }
    }
}
