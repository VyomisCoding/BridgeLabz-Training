import java.util.*;

public class LexicalTwist{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first word :");
        String word1 = sc.nextLine().trim();
        System.out.println("Enter the second word");
        String word2 = sc.nextLine().trim();

        // validation----------------------------------------------------------
        if(word1.contains(" ")){
            System.out.println(word1 + " is an invalid word");
            return;
        }
        if(word2.contains(" ")){
            System.out.println(word2 + " is an invalid number");
            return;
        }

        // CHECK REVERSED CONDITION --------------------------------------------
        String reversedWord1 = new StringBuilder(word1).reverse().toString();
        boolean isReversed   = reversedWord1.equalsIgnoreCase(word2);

        if(isReversed){                                                                 // second word is reverse of first
            String transformed = reversedWord1.toLowerCase();                           // reversing is done now convert to lowercase
            transformed = transformed.replaceAll("[aeiou]","@");     // replace vowels to @
            System.out.println(transformed);                                            // print transformed word
        }
        else{
            String combined = word1 + word2;    // combine both words
            combined = combined.toUpperCase();  // convert to uppercase
            int vowelCount = 0;                 // count vowels and consonants
            int consonantCount = 0;
            for(char ch : combined.toCharArray()){ 
                if(Character.isLetter(ch)){
                    if("AEIOU".indexOf(ch) != -1)
                        vowelCount++;
                    else
                        consonantCount++;
                }
            }
            
            // Based on Comparison-----------------------------------------------
            if(vowelCount > consonantCount){
                StringBuilder result = new StringBuilder();                      // Print first 2 unique vowels
                HashSet<Character> seen = new HashSet<>();
                for(char ch : combined.toCharArray()){
                    if("AEIOU".indexOf(ch) != -1 && !seen.contains(ch)){
                        seen.add(ch);
                        result.append(ch);
                        if (result.length() == 2) break;
                    }
                }
                System.out.println(result.toString());
            }
            else if (consonantCount > vowelCount){
                StringBuilder result = new StringBuilder();                      // Print first 2 unique consonants
                HashSet<Character> seen = new HashSet<>();
                for(char ch : combined.toCharArray()){
                    if(Character.isLetter(ch) && "AEIOU".indexOf(ch) == -1 && !seen.contains(ch)){
                        seen.add(ch);
                        result.append(ch);
                        if (result.length() == 2) break;
                    }
                }
                System.out.println(result.toString());
            }else{
                System.out.println("Vowels and consonants are equal");
            }
        }
    }
}
