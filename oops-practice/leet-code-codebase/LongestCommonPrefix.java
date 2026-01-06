import java.util.Scanner;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs){   // Method to find longest common prefix

        if (strs == null || strs.length == 0){  // If array is empty, return empty string
            return "";
        }
        String prefix = strs[0];    // Take first word as prefix

        for (int i = 1; i < strs.length; i++){   // Compare prefix with remaining words
            while (!strs[i].startsWith(prefix)){

                prefix = prefix.substring(0, prefix.length() - 1);    // Reduce prefix from end

                if (prefix.isEmpty()){    // If prefix becomes empty
                    return "";
                }
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of words: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        String[] words = new String[n];
        System.out.println("Enter the words:");
        for (int i = 0; i < n; i++) {
            words[i] = sc.nextLine();
        }
        String result = longestCommonPrefix(words);// Call method and print result
        System.out.println("Longest Common Prefix: " + result);

        sc.close();
    }
}
