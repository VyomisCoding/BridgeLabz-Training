import java.util.*;
public class ConvertToLowercase {
	public static String convertToLowercase(String text) {
        String output = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                output += (char) (ch + 32);
            } else {
                output += ch;
            }
        }
        return output;
    }
	
    public static boolean compareStrings(String s1, String s2){// Method to compare two strings using charAt()
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

        String customLower = convertToLowercase(text);
        String builtInLower = text.toLowerCase();

        boolean result = compareStrings(customLower, builtInLower);

        System.out.println("\nCustom Lowercase : " + customLower);
        System.out.println("Built-in Lowercase : " + builtInLower);
        System.out.println("Comparison Result : " + result);
    }
}
