import java.util.*;
public class CountVowelsAndConsonants {
	
	public static String checkChar(char ch) {
        if (ch >= 'A' && ch <= 'Z') ch = (char)(ch + 32);

        if (ch >= 'a' && ch <= 'z') {
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                return "Vowel";
            else
                return "Consonant";
        }
        return "NotLetter";
    }
	
	public static int[] countVowelsConsonants(String text) {
        int vowels = 0, consonants = 0;
        for (int i = 0; i < text.length(); i++) {
            String type = checkChar(text.charAt(i));
            if (type.equals("Vowel")) vowels++;
            if (type.equals("Consonant")) consonants++;
        }
        return new int[]{vowels, consonants};
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter text: ");
        String text = sc.nextLine();

        int[] result = countVowelsConsonants(text);
        System.out.println("Vowels : " + result[0]);
        System.out.println("Consonants : " + result[1]);
	}

}
