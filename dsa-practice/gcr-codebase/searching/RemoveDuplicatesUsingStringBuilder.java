import java.util.*;

public class RemoveDuplicatesUsingStringBuilder{
    public static String removeDuplicates(String input){
        StringBuilder sb = new StringBuilder();      // to store result
        HashSet<Character> seen = new HashSet();     // HashSet to track already seen characters
        for(char ch : input.toCharArray()){
            if(!seen.contains(ch)){
                sb.append(ch);       // add to StringBuilder
                seen.add(ch);        // mark as seen
            }
        }
        return sb.toString();        // convert StringBuilder to String and return
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result  = removeDuplicates(str);
        System.out.println("String after removing duplicates"+result);
    }

}
