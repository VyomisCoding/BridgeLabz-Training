import java.util.*;
public class HeightForFootballTeam {
	
    public static int findSum(int[] arr){// Method to find the sum of array elements
        int sum = 0;
        for (int h : arr) sum += h;
        return sum;
    }

    public static double findMean(int[] arr) {// Method to find the mean height
        int total = findSum(arr);
        return (double) total / arr.length;
    }

    public static int findShortest(int[] arr){// Method to find the shortest height
        int shortest = arr[0];
        for (int h : arr) {
            if (h < shortest) shortest = h;
        }
        return shortest;
    }
    
    public static int findTallest(int[] arr){// Method to find the tallest height
        int tallest = arr[0];
        for (int h : arr) {
            if (h > tallest) tallest = h;
        }
        return tallest;
    }
    
	public static void main(String[] args) {
		int[] heights = new int[11];
        Random random = new Random();

        for (int i = 0; i < heights.length; i++) {// Fill array with random heights between 150–250 cm
            heights[i] = 150 + random.nextInt(101);  // gives 150–250
        }
        
        System.out.println("Player Heights (in cm):");// Display generated heights
        for (int h : heights) {
            System.out.print(h + " ");
        }
        
        System.out.println();
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);
        double mean = findMean(heights);
        System.out.println("\n--- Height Analysis ---");
        System.out.println("Shortest Height: " + shortest + " cm");
        System.out.println("Tallest Height : " + tallest + " cm");
        System.out.println("Mean Height    : " + mean + " cm");
	}
}
