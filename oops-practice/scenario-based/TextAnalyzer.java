import java.util.Scanner;

public class TextAnalyzer {
    static void analyzeText(String paragraph, String oldWord, String newWord) {
        if (paragraph == null || paragraph.trim().isEmpty()) {
            System.out.println("Paragraph is empty.");
            return;
        }
        paragraph = paragraph.trim();
        String[] words = paragraph.split("\\s+");      // split words
        System.out.println("Word Count: " + words.length);   // word count

        String longestWord = words[0];   // find longest word
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("Longest Word: " + longestWord);
        String updatedParagraph = paragraph.replaceAll("(?i)\\b" + oldWord + "\\b", newWord);   // replace word (case-insensitive)
        System.out.println("\nUpdated Paragraph:");
        System.out.println(updatedParagraph);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the paragraph:");
        String paragraph = sc.nextLine();
        System.out.println("Enter word to replace:");
        String oldWord = sc.next();
        System.out.println("Enter new word:");
        String newWord = sc.next();
        System.out.println();
        analyzeText(paragraph, oldWord, newWord);
    }
}
