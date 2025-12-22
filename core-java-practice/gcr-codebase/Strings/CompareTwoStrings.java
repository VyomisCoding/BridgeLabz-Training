import java.util.*;
public class CompareTwoStrings {
	public static boolean compareWithCharAt(String s1,String s2) {
		if(s1.length() != s2.length()) {
			return false;
		}
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i) != s2.charAt(i)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first string:");
		String str1 = sc.next();
		
		System.out.print("Enter the first string:");
		String str2 = sc.next();
		
		boolean resultByCharAt = compareWithCharAt(str1,str2);
		boolean resultByEquals=str1.equals(str2);
		
		System.out.println("Comparison by CharAt(charAt): " + resultByCharAt);
        System.out.println("Built-in equals() Comparison: " + resultByEquals);

        // Verify both methods return same result
        if (resultByCharAt == resultByEquals) {
            System.out.println("✅ Both methods give the same result.");
        } else {
            System.out.println("❌ Methods returned different results.");
        }
		
	}

}
