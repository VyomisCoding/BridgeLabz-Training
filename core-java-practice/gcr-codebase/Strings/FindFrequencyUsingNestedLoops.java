import java.util.*;
public class FindFrequencyUsingNestedLoops {
	
	static String[] findFrequencyOfChar(String text) {
        char[] ch = text.toCharArray();
        int[] freq = new int[ch.length];
        for (int i = 0; i < ch.length; i++) {
            freq[i] = 1;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    freq[i]++;
                    ch[j] = '0';
                }
            }
        }
        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != '0') {
                count++;
            }
        }
        String[] result = new String[count];
        int idx = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != '0') {
                result[idx] = ch[i] + " : " + freq[i];
                idx++;
            }
        }
        return result;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter text: ");
        String text = sc.nextLine();
        String[] data = findFrequencyOfChar(text);
        System.out.println("\nCharacter Frequency");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
	}

}
