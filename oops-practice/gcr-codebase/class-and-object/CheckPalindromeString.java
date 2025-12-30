import java.util.Scanner;

class PalindromeChecker {
    String text;

    void getText(Scanner sc) {
        System.out.print("Enter text: ");
        text = sc.nextLine();
    }

    boolean isPalindrome() {
        String clean = text.replaceAll("[^a-zA-Z]", "").toLowerCase();
        int start = 0;
        int end = clean.length() - 1;

        while (start < end) {
            if (clean.charAt(start) != clean.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    void displayResult() {
        if (isPalindrome()) {
            System.out.println(text + " is palindrome");
        } else {
            System.out.println(text + " is not Palindrome");
        }
    }
}

public class CheckPalindromeString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PalindromeChecker p1 = new PalindromeChecker();
        p1.getText(sc);
        p1.displayResult();

        PalindromeChecker p2 = new PalindromeChecker();
        p2.getText(sc);
        p2.displayResult();
    }
    
}
