import java.util.*;
public class FindTallest {
	
	public static String youngest(int[] ages, String[] names){ // for finding tallest
        int min = ages[0];
        int idx = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < min) {
                min = ages[i];
                idx = i;
            }
        }
        return names[idx];
    }
	
	public static String tallest(double[] heights, String[] names) {// for finding tallest
        double max = heights[0];
        int idx = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > max) {
                max = heights[i];
                idx = i;
            }
        }
        return names[idx];
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + friends[i] + ": ");
            ages[i] = sc.nextInt();

            System.out.print("Enter height of " + friends[i] + ": ");
            heights[i] = sc.nextDouble();
        }
        System.out.println("Youngest: " + youngest(ages, friends));
        System.out.println("Tallest: " + tallest(heights, friends));
	}
}
