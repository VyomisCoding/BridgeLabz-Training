import java.util.Scanner;

public class ReplaceSpaces{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence with multiple spaces:");
        String input = sc.nextLine();
        String result = input.replaceAll("\\s+", " ");   // Replace multiple spaces with single space
        System.out.println("Output:");
        System.out.println(result);
    }
}
