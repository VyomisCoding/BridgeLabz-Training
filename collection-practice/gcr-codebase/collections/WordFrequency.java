// Map Interface

import java.util.*;

public class WordFrequency{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = sc.nextLine().toLowerCase();
        text = text.replaceAll("[^a-z0-9 ]", " ");   // remove punctuation
        String[] words = text.split("\\s+");
        Map<String, Integer> map = new HashMap<>();
        for(String w : words){
            map.put(w, map.getOrDefault(w, 0) + 1);
        }
        System.out.println("Word Frequency: " + map);
    }
}
