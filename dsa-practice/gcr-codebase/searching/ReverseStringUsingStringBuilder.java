
import java.util.*;

public class ReverseStringUsingStringBuilder{
    public static String reverseString(String input){   // method to reverse using StringBuilder
        StringBuilder sb = new StringBuilder();         // StringBuilder Object
        sb.append(input);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        String reversed = reverseString(str);
        System.out.println("Reversed String"+reversed);
    } 
}
