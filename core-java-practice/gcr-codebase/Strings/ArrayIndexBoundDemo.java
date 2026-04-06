import java.util.*;
public class ArrayIndexBoundDemo {
	public static void toGenerateException(String[] names) {
        System.out.println(names[names.length]);// Accessing index beyond array length
    }
	
	public static void handleException(String[] names) {
        try {
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled safely.");
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught.");
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of names: ");
        int size = sc.nextInt();
        String[] names = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.next();
        }
        
        try {
            toGenerateException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception generated and caught in main().");
        }
        
        handleException(names);
	}
	
	
}
