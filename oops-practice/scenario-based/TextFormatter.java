import java.util.Scanner;

public class TextFormatter {
    static String formatText(String input) {
        if (input == null || input.trim().isEmpty()) {
            return "";
        }
        input = input.trim().replaceAll("\\s+", " ");  // remove extra spaces
        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (capitalizeNext && Character.isLetter(ch)) {
                result.append(Character.toUpperCase(ch));
                capitalizeNext = false;
            } else {
                result.append(ch);
            }
            if (ch == '.' || ch == '?' || ch == '!') {
                capitalizeNext = true;
            }
        }
        return result.toString().replaceAll("\\s*([.!?])\\s*", "$1 ").trim(); // ensure only one space after punctuation
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a paragraph:");
        String inputText = sc.nextLine();
        String formattedText = formatText(inputText);
        System.out.println("\nCorrected Text:");
        System.out.println(formattedText);
    }
}
