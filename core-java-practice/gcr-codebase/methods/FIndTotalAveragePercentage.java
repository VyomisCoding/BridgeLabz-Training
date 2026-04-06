import java.util.*;
public class FIndTotalAveragePercentage {
	
	//Generate random PCM scores (2-digit numbers)---------------------------------------------------------------------------------------------------
    public static int[][] generateScores(int n) {
        Random r = new Random();
        int[][] scores = new int[n][3];//pcm

        for (int i = 0; i < n; i++) {
            scores[i][0] = 50 + r.nextInt(51);  // Physics 50–100
            scores[i][1] = 50 + r.nextInt(51);  // Chemistry
            scores[i][2] = 50 + r.nextInt(51);  // Math
        }
        return scores;
    }
	
	// Calculate Total, Average, Percentage-------------------------------------------------------------------------------------------------------
    public static double[][] calculateResults(int[][] scores) {
        int n = scores.length;
        double[][] result = new double[n][3]; // total, avg, percent

        for (int i = 0; i < n; i++) {
            int p = scores[i][0];
            int c = scores[i][1];
            int m = scores[i][2];

            double total = p + c + m;
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;

            // Round to 2 decimals
            total = Math.round(total * 100.0) / 100.0;
            avg = Math.round(avg * 100.0) / 100.0;
            percent = Math.round(percent * 100.0) / 100.0;

            result[i][0] = total;
            result[i][1] = avg;
            result[i][2] = percent;
        }
        return result;
    }
    
	// Display Scorecard-----------------------------------------------------------------------------------------------------------------------------
    public static void displayScoreCard(int[][] scores, double[][] results) {
        System.out.println("ID\tPhysics\tChem\tMaths\tTotal\tAvg\tPercentage");
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "\t" + scores[i][0] + "\t" + scores[i][1] + "\t" + scores[i][2] + "\t" + results[i][0] + "\t" + results[i][1] + "\t" + results[i][2]);
        }
    }
    
	public static void main(String[] args){// main--------------------------------------------------------------------------------------------------------
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[][] pcmScores = generateScores(n);
        double[][] results = calculateResults(pcmScores);
        displayScoreCard(pcmScores, results);
	}

}
