import java.util.*;
public class AnagramCheckInStrings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine().replaceAll(" ", "").toLowerCase();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine().replaceAll(" ", "").toLowerCase();
        if(str1.length() != str2.length()){
            System.out.println("Not Anagrams");
            return;
        }
        int[] freq = new int[256];
        for(char ch : str1.toCharArray()) freq[ch]++;
        for(char ch : str2.toCharArray()) freq[ch]--;
        for(int f : freq){
            if(f != 0){
                System.out.println("Not Anagrams");
                return;
            }
        }
        System.out.println("Strings are Anagrams");
	}
}
