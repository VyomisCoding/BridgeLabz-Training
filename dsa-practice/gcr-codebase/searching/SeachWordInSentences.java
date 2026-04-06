//  Linear Search Problem 2: Search for a Specific Word in a List of Sentences

import java.util.*;
public class SeachWordInSentences{
    public static String searchSentence(String[] sentences, String word){
        for(String s : sentences){
            if(s.contains(word)){
                return s;   // sentence found
            }
        }
        return "Not Found";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of sentences: ");
        int n = Integer.parseInt(sc.nextLine());
        String[] sentences = new String[n];
        System.out.println("Enter the sentences:");
        for(int i=0;i < n;i++){
            sentences[i] = sc.nextLine();
        }
        System.out.print("Enter word to search: ");
        String word = sc.nextLine();
        System.out.println("Result: " + searchSentence(sentences, word));
    }
}
