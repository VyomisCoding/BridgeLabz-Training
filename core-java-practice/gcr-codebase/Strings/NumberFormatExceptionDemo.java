import java.util.*;
public class NumberFormatExceptionDemo {
	public static void toGenerateException(String text) {
        int number = Integer.parseInt(text);
        System.out.println(number);
    }
	
	public static void handleException(String text) { // Method for handleing NumberFormatException
        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled: Invalid number format.");
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught.");
        }
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter text: ");
        String input = sc.next();

        // Generating exception
        try {
            toGenerateException(input);
        } catch (NumberFormatException e) {
            System.out.println("Exception generated and caught in main().");
        }
        handleException(input);// Handling exception
	}
}
