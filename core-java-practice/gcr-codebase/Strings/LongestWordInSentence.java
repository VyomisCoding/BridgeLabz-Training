import java.util.*;
public class LongestWordInSentence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        String[] words = str.split(" ");
        String longest = "";
        for(String w : words){
            if(w.length() > longest.length()){
                longest = w;
            }
        }
        System.out.println("Longest Word: " + longest);
	}
}
