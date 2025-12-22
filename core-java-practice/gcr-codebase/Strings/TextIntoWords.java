import java.util.*;
public class TextIntoWords {
	
	public static int findLength(String text) {
        int i = 0;
        try {
            while (true) {
                text.charAt(i);
                i++;
            }
        } catch (RuntimeException e) {
            return i;
        }
    }
	
	public static String[] splitWords(String text) {
        int count = 1;
        for (int i = 0; i < findLength(text); i++) {
            if (text.charAt(i) == ' ') count++;
        }
        String[] words = new String[count];
        String temp = "";
        int idx = 0;
        for (int i = 0; i < findLength(text); i++) {
            if (text.charAt(i) != ' ') {
                temp += text.charAt(i);
            } else {
                words[idx++] = temp;
                temp = "";
            }
        }
        words[idx] = temp;
        return words;
    }
	
	public static String[][] wordWithLength(String[] words) {
        String[][] table = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(findLength(words[i]));
        }
        return table;
    }
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] data = wordWithLength(words);

        System.out.println("\nWord\tLength");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + Integer.parseInt(data[i][1]));
        }
	}
}
