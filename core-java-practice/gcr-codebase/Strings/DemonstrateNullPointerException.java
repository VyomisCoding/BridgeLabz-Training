import java.util.*;
public class DemonstrateNullPointerException {
	public static void toGenerateException() {
		String text = null;
		System.out.println(text.length());
	}
	
	public static void handleException() {
		String text = null;
		
		try {
			System.out.println(text.toUpperCase());
		}catch(NullPointerException e){
			System.out.println("NullPointerException handled it safely.");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
            toGenerateException();//calling method that will generate exception
        } catch (NullPointerException e) {
            System.out.println("Exception generated and caught in main().");
        }
		handleException();// Calling refactored method that handles exception internally
	}
}
