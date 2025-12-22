import java.util.*;
public class UniqueCharacters {
	
    static int findLen(String s){// find length without using length()
        int i = 0;
        try {
            while (true) {
                s.charAt(i);
                i++;
            }
        } catch (Exception e) {
            return i;
        }
    }
    
    // find unique characters using charAt()
    static char[] findUnique(String s) {

        int len = findLen(s);
        char[] temp = new char[len];
        int count = 0;
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == ch) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                temp[count] = ch;
                count++;
            }
        }
        // create final array with exact size
        char[] result = new char[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }
        return result;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        char[] uniqueChars = findUnique(text);
        System.out.println("\nUnique characters are:");
        for (int i = 0; i < uniqueChars.length; i++) {
            System.out.print(uniqueChars[i] + " ");
        }
	}

}
