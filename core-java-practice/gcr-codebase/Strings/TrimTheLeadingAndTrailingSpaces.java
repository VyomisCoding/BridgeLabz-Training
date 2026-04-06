import java.util.*;
public class TrimTheLeadingAndTrailingSpaces {
	
	public static int[] findTrimPoints(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }
        return new int[]{start, end + 1};
    }
	
    public static String createSubstring(String text, int start, int end) {// Method for create substring using charAt()
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String a, String b) {// Method to compare two strings using charAt()
        if (a.length() != b.length()) return false;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter text with spaces: ");
        String text = sc.nextLine();

        int[] points = findTrimPoints(text);
        String manualTrim = createSubstring(text, points[0], points[1]);
        String builtInTrim = text.trim();

        System.out.println("Manual Trim : [" + manualTrim + "]");
        System.out.println("Built-in Trim : [" + builtInTrim + "]");
        System.out.println("Comparison Result : " + compareStrings(manualTrim, builtInTrim));
	}

}
