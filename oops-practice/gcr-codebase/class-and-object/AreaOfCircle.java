import java.util.Scanner;

class Circle {
    double radius;

    void getRadius(Scanner sc) {
        System.out.print("Enter radius of circle: ");
        radius = sc.nextDouble();
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    void displayResult() {
        System.out.printf("Area of circle: %.4f\n", calculateArea());
        System.out.printf("Circumference of circle: %.4f\n", calculateCircumference());
    }
}

public class AreaOfCircle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Circle circle = new Circle();
        circle.getRadius(sc);
        circle.displayResult();
    }
    
}
