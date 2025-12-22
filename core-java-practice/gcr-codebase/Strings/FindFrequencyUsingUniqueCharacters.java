import java.util.*;
public class FindFrequencyUsingUniqueCharacters {
	
	static char[] uniqueChars(String text){ // method for unique characters
        char[] temp = new char[text.length()];
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == ch) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                temp[count] = ch;
                count++;
            }
        }
        char[] result = new char[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }
        return result;
    }
	
	static String[][] frequencyUsingUnique(String text){ //Frequency Using Unique characters
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }
        char[] unique = uniqueChars(text);
        String[][] data = new String[unique.length][2];
        for (int i = 0; i < unique.length; i++) {
            data[i][0] = String.valueOf(unique[i]);
            data[i][1] = String.valueOf(freq[unique[i]]);
        }
        return data;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String text = sc.nextLine();
        String[][] result = frequencyUsingUnique(text);
        System.out.println("\nChar\tFrequency");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t" + result[i][1]);
        }
	}

}
