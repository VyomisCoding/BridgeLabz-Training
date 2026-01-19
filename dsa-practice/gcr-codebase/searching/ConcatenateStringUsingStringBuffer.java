// Concatenate Strings Efficiently Using StringBuffer

import java.util.*;

public class ConcatenateStringUsingStringBuffer{
    public static String concatenateStrings(String[] arr){
        StringBuffer sb = new StringBuffer();  // StringBuffer is threadsafe & mutable
        for(String s : arr){
            sb.append(s);  // efficient concatenation
        }
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of strings");
        int n=sc.nextInt();
        sc.nextLine();     // consume newline
        String[] arr = new String[n];
        System.out.println("Enter the strings");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextLine();
        }
        String result = concatenateStrings(arr);
        System.err.println("Concatenated String"+result);
    }
}
