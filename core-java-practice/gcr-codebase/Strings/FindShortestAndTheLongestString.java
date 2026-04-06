import java.util.*;
public class FindShortestAndTheLongestString {
	public static int findLength(String s) {
        int i = 0;
        try {
            while (true) {
                s.charAt(i);
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

        String[] arr = new String[count];
        String temp = "";
        int idx = 0;

        for (int i = 0; i < findLength(text); i++) {
            if (text.charAt(i) != ' ') temp += text.charAt(i);
            else {
                arr[idx++] = temp;
                temp = "";
            }
        }
        arr[idx] = temp;
        return arr;
    }
	
	public static int[] findShortLong(String[] words) {

        int min = findLength(words[0]);
        int max = findLength(words[0]);
        int minIdx = 0, maxIdx = 0;

        for (int i = 1; i < words.length; i++) {
            int len = findLength(words[i]);
            if (len < min) { min = len; minIdx = i; }
            if (len > max) { max = len; maxIdx = i; }
        }
        return new int[]{minIdx, maxIdx};
    }
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);
        int[] res = findShortLong(words);

        System.out.println("Shortest Word : " + words[res[0]]);
        System.out.println("Longest Word : " + words[res[1]]);
	}
}
