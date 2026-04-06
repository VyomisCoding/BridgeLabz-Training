import java.util.*;
public class RandomStats {
	
	public int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = 1000 + rnd.nextInt(9000);
        }
        return arr;
    }
	
	public double[] findAverageMinMax(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        double sum = 0;
        for (int n : nums) {
            sum += n;
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
        double avg = sum / nums.length;
        return new double[]{avg, min, max};
    }

	public static void main(String[] args) {
		RandomStats obj = new RandomStats();
        int[] arr = obj.generate4DigitRandomArray(5);
        System.out.print("Generated Numbers: ");
        for (int n : arr) System.out.print(n + " ");
        System.out.println();
        double[] details = obj.findAverageMinMax(arr);
        System.out.println("Average = " + details[0]);
        System.out.println("Minimum = " + details[1]);
        System.out.println("Maximum = " + details[2]);
	}

}
