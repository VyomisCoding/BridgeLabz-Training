
import java.util.Scanner;

public class RocketLaunchCountdownUsingForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the countdown start number: ");
        int startcounterfrom = sc.nextInt();
        for (int i = startcounterfrom; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Rocket Launched!");
    }
    
}
