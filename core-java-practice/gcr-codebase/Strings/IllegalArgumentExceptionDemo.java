import java.util.*;
public class IllegalArgumentExceptionDemo {
	public static void toGenerateException(String text) {
        System.out.println(text.substring(5, 2));//Start the index greater than end index
    }
	
    public static void handleException(String text) {// Method for handling IllegalArgumentException
        try {
            System.out.println(text.substring(6, 3));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled safely.");
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught.");
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
        String input = sc.next();
        //generating exception
        try {
           toGenerateException(input);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception generated and caught in main().");
        }

        // Handling exception
        handleException(input);
	}
	
}
