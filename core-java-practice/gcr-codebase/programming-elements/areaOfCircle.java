
import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double pievalue = 3.14;
        System.out.println("Enter the radius of the circle:");
        Double radiusofcircle=sc.nextDouble();
        Double areaofcircle= pievalue*radiusofcircle*radiusofcircle;
        System.out.println("Area of Circle is: " + areaofcircle);
    }
}
