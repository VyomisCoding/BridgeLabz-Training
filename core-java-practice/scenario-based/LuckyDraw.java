import java.util.*;
public class LuckyDraw {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int visitorCount = 1;
        while (true) {

            System.out.print("\nVisitor " + visitorCount + " - Enter your lucky number (or -1 to stop): ");
            int luckyNumber = sc.nextInt();
            
            if (luckyNumber == -1){ // condition to stop the loop
                System.out.println("Lucky draw closed. Thanks for visiting the mela!");
                break;
            }

            if (luckyNumber <= 0){ // invalid input check
                System.out.println("Invalid number! Please enter a positive number.");
                continue;
            }
            
            if (luckyNumber % 3 == 0 && luckyNumber % 5 == 0){ // check for divisibility by 3 and 5
                System.out.println("Congratulations! You won a Diwali gift");
            } else {
                System.out.println("Better luck next time");
            }

            visitorCount++;
        }
	}

}
