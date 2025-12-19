
import java.util.Scanner;


public class RocketLaunchCountdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the countdown start number: ");
        int startcounterfrom = sc.nextInt();
        while(startcounterfrom >= 1){
            System.out.println(startcounterfrom);
            startcounterfrom--;
        }
        System.out.println("Rocket Launched!");
    }
}
