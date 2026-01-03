import java.util.*;

public class StudentTestScores{

    static void analyzeScores(int[] scores) {
        int sum = 0;
        int max = scores[0];
        int min = scores[0];

        for (int s : scores) {
            sum += s;
            if (s > max) max = s;
            if (s < min) min = s;
        }

        double avg = (double) sum / scores.length;
        System.out.println("Average Score is : " + avg);
        System.out.println("Highest Score is : " + max);
        System.out.println("Lowest Score is : " + min);

        System.out.println("Scores above average:");
        for (int s : scores) {
            if (s > avg) {
                System.out.println(s);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] scores = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter score of student " + (i + 1) + ": ");
            int score = sc.nextInt();

            if (score < 0) {
                System.out.println("Invalid score! Try again.");
                i--;
                continue;
            }
            scores[i] = score;
        }

        analyzeScores(scores);
    }
}
