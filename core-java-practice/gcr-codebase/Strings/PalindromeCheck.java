import java.util.*;
public class PalindromeCheck {
	
	// Logic 1: Using start and end indexes
    static boolean isPalindromeLoop(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    
	// Logic 2: Using recursion
    static boolean isPalindromeRec(String text, int start, int end) {
        if (start >= end) return true;

        if (text.charAt(start) != text.charAt(end)) return false;
        return isPalindromeRec(text, start + 1, end - 1);
    }
    
	// Logic 3: Using reverse array
    static boolean isPalindromeArray(String text) {
        char[] original = text.toCharArray();
        char[] reverse = new char[original.length];

        int idx = 0;
        for (int i = original.length - 1; i >= 0; i--) {
            reverse[idx++] = original[i];
        }

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) {
                return false;
            }
        }
        return true;
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.println("Done using Loop      : " + isPalindromeLoop(text));
        System.out.println("Done using Recursion : " + isPalindromeRec(text, 0, text.length() - 1));
        System.out.println("Done using Array     : " + isPalindromeArray(text));
	}

}
