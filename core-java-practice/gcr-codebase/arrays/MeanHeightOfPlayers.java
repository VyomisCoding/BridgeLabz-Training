import java.util.*;
public class MeanHeightOfPlayers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] heightsOfPlayers = new double[11];
		double sum=0.0;
		for(int i=0; i < heightsOfPlayers.length;i++) {
			System.out.print("Enter height of player " + (i + 1) + ": ");
            heightsOfPlayers[i] = sc.nextDouble();
            sum += heightsOfPlayers[i];
		}
		double meanHeight = sum / heightsOfPlayers.length;

        System.out.println("\nMean height of the football team = " + meanHeight);
	}
}
