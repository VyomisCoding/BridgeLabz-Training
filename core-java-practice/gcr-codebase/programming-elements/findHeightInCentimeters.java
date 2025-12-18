import java.util.Scanner;
public class findHeightInCentimeters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height in centimeters (Ex-170.0) :");
        double heightInCm = sc.nextDouble();
        double heightInInches = Math.round(heightInCm / 2.54 * 100.0) / 100.0;
        double heightInFeet = Math.round(heightInCm / 30.48 * 100.0) / 100.0;
        System.out.println("Your Height in cm is "+heightInCm+"while in feet is "+heightInFeet+" and inches is "+heightInInches);
    }
}
