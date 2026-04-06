public class Circle {
    double radius;

    Circle() {
        this(1.0); // constructor chaining
    }

    Circle(double r) {
        radius = r;
    }

    void display() {
        System.out.println("Radius: " + radius);
    }
}
