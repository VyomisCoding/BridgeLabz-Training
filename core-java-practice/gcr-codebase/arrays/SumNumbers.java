import java.util.*;
public class SumNumbers {
	static int readNumbers(double[] values) {
		Scanner sc = new Scanner(System.in);
		int position=0;
		while(true) {
			System.out.print("Enter a number: ");
            double userValue = sc.nextDouble();
            if (userValue <= 0) {//stop when user enters zero
                break;
            }
            if (position == values.length) {// stop if limit is reached
                break;
            }
            values[position] = userValue;
            position++;
		}
		return position;
	}
	// Method to display values and calculate total
	static double showValuesAndSum(double[] values, int count) {
		double total = 0.0;
		System.out.println("\nStored numbers:");
		for (int i = 0; i < count; i++) {
			System.out.println(values[i]);
			total += values[i];
	    }
	    return total;
	}
	public static void main(String[] args) {
		double[] numbers = new double[10];
	    int storedCount = readNumbers(numbers);
	    double sum = showValuesAndSum(numbers, storedCount);
	    System.out.println("\nTotal sum = " + sum);
	}
}

