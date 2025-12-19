import java.util.Scanner;

public class DiscountedUniversityFeesUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter course fee: ");
        double fee = sc.nextDouble();
        System.out.print("Enter discount percentage: ");
        double discountPercent = sc.nextDouble();
        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;
        discount = Math.round(discount);
        finalFee = Math.round(finalFee);
        // Output
        System.out.println("The discount amount is INR " + discount +" and final discounted fee is INR " + finalFee);
    }
    
}