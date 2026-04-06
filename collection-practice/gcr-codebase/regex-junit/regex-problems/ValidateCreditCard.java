import java.util.Scanner;

public class ValidateCreditCard{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a credit card number:");
        String card = sc.nextLine();
        String visaRegex = "^4[0-9]{15}$";       // Visa 16 digits
        String masterRegex = "^5[0-9]{15}$";     // MasterCard 16 digits
        if(card.matches(visaRegex)){
            System.out.println("Valid Visa Card");
        }else if(card.matches(masterRegex)){
            System.out.println("Valid MasterCard");
        }else{
            System.out.println("Invalid Card Number");
        }
    }
}
