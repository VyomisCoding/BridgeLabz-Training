import java.util.*;
public class FindLengthWithoutUsingLengthMethod {
	
	public static int findLength(String text) {
        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (RuntimeException e) {
            return count;
        }
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
        String input = sc.next();

        int customLength = findLength(input);
        int builtInLength = input.length();

        System.out.println("Custom Length : " + customLength);
        System.out.println("Built-in Length : " + builtInLength);
	}
}
