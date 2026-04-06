
import java.util.Scanner;

public class SideOfSquareFromPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the perimeter of the square: ");
        double perimeterOfSquare = sc.nextDouble();
        double sideOfSquare = perimeterOfSquare / 4;
        System.out.println("The length of the side is: " + sideOfSquare +"whose perimeter is "+perimeterOfSquare);
    }
}
