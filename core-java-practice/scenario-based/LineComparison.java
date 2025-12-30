import java.util.*;
public class LineComparison {

	public static void main(String[] args) {
		printWelcomeMessage(); // UC1 : method to display welcome message

        // UC2: Define points for Line 1
        double x1 = 2, y1 = 3;
        double x2 = 6, y2 = 7;

        // UC3: Define points for Line 2
        double x3 = 1, y3 = 4;
        double x4 = 5, y4 = 8;

        // Calculate lengths
        Double lineLength1 = calculateLineLength(x1, y1, x2, y2);
        Double lineLength2 = calculateLineLength(x3, y3, x4, y4);

        // Display lengths
        displayLength("Line 1", lineLength1);
        displayLength("Line 2", lineLength2);

        // UC4: Check equality using equals()
        checkEquality(lineLength1, lineLength2);

        // UC5: Compare lines using compareTo()
        compareLines(lineLength1, lineLength2);

	}
	
    public static void printWelcomeMessage(){ // Method to print welcome message
        System.out.println("Welcome to Line Comparison Computation Program on Master Branch");
    }

    public static double calculateLineLength(double x1, double y1, double x2, double y2){ // Method to calculate line length using distance formula
        double xDifference = x2 - x1;
        double yDifference = y2 - y1;

        double length = Math.sqrt((xDifference * xDifference) + (yDifference * yDifference));
        return length;
    }

    public static void displayLength(String lineName, double length){ // Method to display line length
        System.out.println(lineName + " Length : " + length);
    }
    
    public static void checkEquality(Double length1, Double length2){ // Method to check equality of two lines
        if (length1.equals(length2)) {
            System.out.println("Both lines are Equal");
        } else {
            System.out.println("Both lines are Not Equal");
        }
    }

    public static void compareLines(Double length1, Double length2){ // Method to compare two lines
        int result = length1.compareTo(length2);
        if (result == 0) {
            System.out.println("Both lines are Equal in Length");
        } else if (result > 0) {
            System.out.println("Line 1 is Greater than Line 2");
        } else {
            System.out.println("Line 1 is Less than Line 2");
        }
    }
}
