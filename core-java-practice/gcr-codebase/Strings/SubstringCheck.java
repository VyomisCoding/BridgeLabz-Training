import java.util.*;
public class SubstringCheck {
	public static String makeSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result = result + text.charAt(i);
        }
        return result;
    }
	
	// Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
        String text = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();
        // Substring using charAt()
        String manualSubstring = makeSubstring(text, start, end);

        // Substring using built-in method
        String builtInSubstring = text.substring(start, end);

        // Comparing both substrings
        boolean isSame = compareStrings(manualSubstring, builtInSubstring);

        System.out.println("\nSubstring using charAt(): " + manualSubstring);
        System.out.println("Substring using substring(): " + builtInSubstring);

        if (isSame) {
            System.out.println("✅ Both substrings are equal.");
        } else {
            System.out.println("❌ Substrings are not equal.");
        }
        
	}
}
