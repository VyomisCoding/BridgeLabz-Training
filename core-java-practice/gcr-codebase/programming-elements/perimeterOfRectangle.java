
import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        Double length = sc.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        Double breadth = sc.nextDouble();
        Double perimeter = 2 * (length + breadth);
        System.out.println("The Perimeter of the rectangle is: " + perimeter);
    }
    
}
