import java.util.*;
public class NumberGuessingGame{
	static int generateGuess(int low, int high) {
        Random r = new Random();
        return r.nextInt(high - low + 1) + low;
    }
	
	static String getFeedback(Scanner sc) {
        System.out.print("Enter feedback (high / low / correct): ");
        return sc.next().toLowerCase();
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int low = 1, high = 100;
        System.out.println("Think of a number between 1 and 100.");

        while (true) {
            int guess = generateGuess(low, high);
            System.out.println("The Computer guess is : " + guess);
            String feedback = getFeedback(sc);
            if (feedback.equals("correct")) {
                System.out.println("Computer guessed correctly!");
                break;
            } else if (feedback.equals("high")) {
                high = guess - 1;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            }
        }
	}
}
