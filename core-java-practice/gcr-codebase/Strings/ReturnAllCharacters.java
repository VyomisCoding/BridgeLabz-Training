import java.util.*;
public class ReturnAllCharacters {
	public static char[] getCharacters(String text) {// method to extract characters
		char[] arr=new char[text.length()];
		for(int i=0;i<text.length();i++) {
			arr[i]=text.charAt(i);
		}
		return arr;
	}
	// Method to compare two character arrays
	public static boolean compareCharArrays(char[] a, char[] b) {
		if (a.length != b.length) {
			return false;
        }
        for (int i = 0; i < a.length; i++) {
        	if (a[i] != b[i]) {
        		return false;
            }
         }
        return true;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.next();
        char[] customArr = getCharacters(input);// User-defined method
        char[] builtInArray = input.toCharArray();// Built-in method

        boolean result = compareCharArrays(customArr, builtInArray);// Comparison

        System.out.println("Characters using user-defined method:");
        for (char c : customArr) {
            System.out.print(c + " ");
        }
        System.out.println("Comparison Result: " + result);
	}

}
