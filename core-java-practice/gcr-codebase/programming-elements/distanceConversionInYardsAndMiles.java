
import java.util.Scanner;

public class distanceConversionInYardsAndMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in Feet: ");
        double distanceInFeets = sc.nextDouble();
        double yards=Math.round((distanceInFeets/3)*100.0)/100.0;
        double miles=Math.round((distanceInFeets/5280)*100.0)/100.0;
        System.out.println("The distance in feet is "+distanceInFeets+" while in yards is "+yards+" and in miles is "+miles);
    }
}
