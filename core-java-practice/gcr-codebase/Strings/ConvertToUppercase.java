import java.util.*;
public class ConvertToUppercase {
	public static String convertToUppercase(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                result += (char) (ch - 32);
            } else {
                result += ch;
            }
        }

        return result;
    }
	
    public static boolean compareStrings(String s1, String s2) {// Method to compare two strings using charAt()
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
		System.out.print("Enter complete text: ");
        String text = sc.nextLine();

        String customUpper = convertToUppercase(text);
        String builtInUpper = text.toUpperCase();

        boolean result = compareStrings(customUpper, builtInUpper);

        System.out.println("Custom Uppercase : " + customUpper);
        System.out.println("Built-in Uppercase : " + builtInUpper);
        System.out.println("Comparison Result : " + result);
	}
}
