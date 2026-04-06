
import java.util.Scanner;

public class NumberCheck {
    // Method to analyze a single number
    static void analyzeNumber(int value, int position) {
        System.out.print("Number at index " + position + " (" + value + ") : ");

        if (value > 0) {
            System.out.print("Positive, ");
            if (value % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        } 
        else if (value < 0) {
            System.out.println("Negative");
        } 
        else {
            System.out.println("Zero");
        }
    }

    // Method to compare first and last elements
    static void compareFirstLast(int first, int last) {
        System.out.println("\nComparison of first and last elements:");
        
        if (first == last) {
            System.out.println("First and last elements are equal.");
        } 
        else if (first > last) {
            System.out.println("First element is greater than last element.");
        } 
        else {
            System.out.println("First element is less than last element.");
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] numbers = new int[5];

        // Taking input from user
        System.out.println("Enter 5 integer values:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("\n--- Number Analysis ---");
        for (int i = 0; i < numbers.length; i++) {
            analyzeNumber(numbers[i], i);
        }

        // Compare first and last elements
        compareFirstLast(numbers[0], numbers[numbers.length - 1]);
    }
}

