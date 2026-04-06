import java.util.*;

class InvalidScoreException extends Exception{   // Custom Exception
    public InvalidScoreException(String message){
        super(message);
    }
}

public class StudentTestScores {
    static double calculateAverage(int[] scores){    // Method to calculate average score
        int sum = 0;
        for (int s : scores){
            sum += s;
        }
        return (double) sum / scores.length;
    }

    static int findMax(int[] scores){     // Method to find highest score
        int max = scores[0];
        for (int s : scores) {
            if (s > max) {
                max = s;
            }
        }
        return max;
    }

    static int findMin(int[] scores){    // Method to find lowest score
        int min = scores[0];
        for (int s : scores) {
            if (s < min) {
                min = s;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter number of students: ");
            int n = sc.nextInt();
            int[] scores = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Enter score of student " + (i + 1) + ": ");
                int score = sc.nextInt();
                if (score < 0 || score > 100){   // Validation as per requirement
                    throw new InvalidScoreException(
                        "Score must be between 0 and 100. Invalid value: " + score
                    );
                }

                scores[i] = score;
            }

            double avg = calculateAverage(scores);
            int max = findMax(scores);
            int min = findMin(scores);

            System.out.println("\nAverage Score is : " + avg);
            System.out.println("Highest Score is : " + max);
            System.out.println("Lowest Score is : " + min);

        } catch (InvalidScoreException e) {
            System.out.println("\nError: " + e.getMessage());
        }
    }
}
