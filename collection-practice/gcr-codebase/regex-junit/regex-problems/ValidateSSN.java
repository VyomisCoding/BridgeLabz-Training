import java.util.Scanner;

public class ValidateSSN{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter SSN:");
        String ssn = sc.nextLine();
        String regex = "^[0-9]{3}-[0-9]{2}-[0-9]{4}$";
        if(ssn.matches(regex)){
            System.out.println("Valid SSN");
        }else{
            System.out.println("Invalid SSN");
        }
    }
}
