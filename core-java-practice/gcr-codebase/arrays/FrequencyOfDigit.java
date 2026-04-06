import java.util.*;
public class FrequencyOfDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number= sc.nextInt();
		int temp = number;
        int count = 0;
        // find number of digits
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }
        // array to store digits
        int[] digits = new int[count];
        temp = number;
        // store digits in array
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp = temp / 10;
        }
        int[] freq = new int[10];// frequency array for digits 0 to 9
        for (int i = 0; i < count; i++) {// count frequency
            freq[digits[i]]++;
        }
        System.out.println("\nDigit Frequency:");// display frequency
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " occurs " + freq[i] + " time(s)");
            }
        }
	}	
}
