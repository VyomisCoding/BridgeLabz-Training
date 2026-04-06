import java.util.*;
public class SplitTheText {
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
	
    public static String[] manualSplit(String text){// Method to split words using charAt()
        int words = 1;
        for (int i = 0; i < findLength(text); i++) {
            if (text.charAt(i) == ' ') {
                words++;
            }
        }
        String[] result = new String[words];
        int index = 0;
        String temp = "";
        for (int i = 0; i < findLength(text); i++) {
            if (text.charAt(i) != ' ') {
                temp += text.charAt(i);
            } else {
                result[index++] = temp;
                temp = "";
            }
        }
        result[index] = temp;
        return result;
    }
    
    public static boolean compareArrays(String[] a, String[] b) {

        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] custom = manualSplit(text);
        String[] builtIn = text.split(" ");

        System.out.println("Comparison Result : " + compareArrays(custom, builtIn));
	}
}
