import java.util.Scanner;
public class FindAreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base of triangle(in inches): ");
        double base = sc.nextDouble();
        System.out.print("Enter height of triangle(in inches): ");
        double height = sc.nextDouble();
        double areaInInches = 0.5 * base * height;
        // 1 inch=2.54cm
        double areaInCm = areaInInches * 2.54 * 2.54 ;
        // Rounding values using inbuilt function
        areaInInches = Math.round(areaInInches * 100.0) / 100.0;
        areaInCm = Math.round(areaInCm * 100.0) / 100.0;
        System.out.println("The area of the triangle in square inches is " + areaInInches + " and in square centimeters is " + areaInCm);
    }
}
