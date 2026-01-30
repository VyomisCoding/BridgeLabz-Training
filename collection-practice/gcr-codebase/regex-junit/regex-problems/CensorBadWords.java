import java.util.Scanner;

public class CensorBadWords{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();
        System.out.println("Enter comma-separated bad words (ex: damn, stupid):");
        String badWordsInput = sc.nextLine();
        String[] badWords = badWordsInput.split(",");     // Split bad words into array
        String result = sentence;
        for (String bad : badWords){     // Replace each bad word with ****
            bad = bad.trim();            // remove extra spaces
            result = result.replaceAll("(?i)" + bad, "****"); 
        }
        System.out.println("Censored Sentence:");
        System.out.println(result);
    }
}
