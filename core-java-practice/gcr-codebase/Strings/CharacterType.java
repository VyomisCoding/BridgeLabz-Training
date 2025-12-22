import java.util.*;
public class CharacterType {
	
	public static String checkChar(char ch) {
        if (ch >= 'A' && ch <= 'Z') ch = (char)(ch + 32);

        if (ch >= 'a' && ch <= 'z') {
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                return "Vowel";
            else
                return "Consonant";
        }
        return "Not a Letter";
    }
	
	public static String[][] analyzeText(String text) {

        String[][] data = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {
            data[i][0] = String.valueOf(text.charAt(i));
            data[i][1] = checkChar(text.charAt(i));
        }
        return data;
    }
	
	public static void display(String[][] table) {

        System.out.println("\nChar\tType");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + table[i][1]);
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter text: ");
        String text = sc.nextLine();

        display(analyzeText(text));
	}

}
