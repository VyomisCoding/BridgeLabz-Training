import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExtraction{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lines containing emails. :-");
        String text = sc.nextLine(); 
        String regex = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        System.out.println("Emails Found:");
        while(matcher.find()){
            System.out.println(matcher.group());
        }
        System.out.println();
    }
}