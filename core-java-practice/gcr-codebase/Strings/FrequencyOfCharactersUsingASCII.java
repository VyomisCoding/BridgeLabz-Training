import java.util.*;
public class FrequencyOfCharactersUsingASCII {
	
	static String[][] findFrequencyOfCharacters(String text){//method for finding frequency
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] != 0) {
                count++;
                freq[text.charAt(i)] = 0;
            }
        }
        String[][] result = new String[count][2];
        freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }
        int idx = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (freq[ch] != 0) {
                result[idx][0] = String.valueOf(ch);
                result[idx][1] = String.valueOf(freq[ch]);
                idx++;
                freq[ch] = 0;
            }
        }
        return result;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String text = sc.nextLine();
        String[][] data = findFrequencyOfCharacters(text);
        System.out.println("\nChar\tFrequency");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
	}

}
