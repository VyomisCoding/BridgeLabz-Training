import java.util.*;
public class StringIndexOutOfBoundDemo {
	public static void generateException(String text) {
		System.out.println(text.charAt(text.length()));
	}
	
	public static void handleException(String text) {
		try {
			System.out.println(text.charAt(text.length()));
		}catch(StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled properly.");
		}
	}
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		String str1 = sc.next();
		try {
			generateException(str1);
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("Exception generated and caught in main().");
		}
		handleException(str1);
	}
}
