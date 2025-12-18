
import java.util.Scanner;

public class IntOperation {
    static void performOperations(int a, int b, int c) {
        int operation1 = a + b * c;
        int operation2 = a * b + c;
        int operation3 = c + Math.floorDiv(a, b) ;
        int operation4 = Math.floorMod(a, b) + c;

        System.out.println("The results of Int Operations are: "+operation1+", "+operation2+", "+operation3+", "+operation4);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");  
        int num1 = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the value of c: ");
        int num3 = sc.nextInt();
        performOperations(num1, num2, num3);
    }
}
