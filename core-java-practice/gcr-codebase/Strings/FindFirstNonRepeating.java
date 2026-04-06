import java.util.*;
public class FindFirstNonRepeating {
	//method for finding non-repeat
	static char findFirstNonRepeat(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (freq[ch] == 1) {
                return ch;
            }
        }
        return '\0'; // no non-repeating character
    }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string: ");
        String text = sc.nextLine();

        char result = findFirstNonRepeat(text);

        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found");
        }
	}

}
