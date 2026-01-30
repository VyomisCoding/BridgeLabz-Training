import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCurrency{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a text:");
        String text = sc.nextLine();
        String regex = "\\$?[0-9]+(\\.[0-9]{2})?";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        System.out.println("Currency Values Found:");
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
