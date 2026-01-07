import java.util.*;

class InvalidQuizSubmissionException extends Exception{       // Custom Exception for invalid quiz submission
    public InvalidQuizSubmissionException(String message){
        super(message);
    }
}


public class OnlineQuizPlatform{
    static int calculateScore(String[] correctAnswers, String[] userAnswers)    // Method to calculate score by comparing answers
            throws InvalidQuizSubmissionException{

        if (correctAnswers.length != userAnswers.length){   // Validate length of answers
            throw new InvalidQuizSubmissionException(
                "Number of answers does not match the quiz questions."
            );
        }
        int score = 0;
        for (int i = 0; i < correctAnswers.length; i++){   // Compare each answer
            if (correctAnswers[i].equalsIgnoreCase(userAnswers[i])){
                score++;
            }
        }
        return score;
    }

    static String getGrade(int score, int totalQuestions){  // Method to return grade based on score
        double percentage = (double) score / totalQuestions * 100;

        if (percentage >= 80) return "A";
        else if (percentage >= 60) return "B";
        else if (percentage >= 40) return "C";
        else return "F";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Correct answers of the quiz
        String[] correctAnswers = {"A", "C", "B", "D", "A"};

        // List to store scores of multiple users
        List<Integer> userScores = new ArrayList<>();

        try {
            System.out.print("Enter number of users: ");
            int users = sc.nextInt();
            sc.nextLine(); // consume newline

            for (int u = 1; u <= users; u++) {
                System.out.println("\nEnter answers for User " + u + ":");

                String[] userAnswers = new String[correctAnswers.length];

                 // Taking user answers
                for (int i = 0; i < userAnswers.length; i++) {
                    System.out.print("Answer for Question " + (i + 1) + ": ");
                    userAnswers[i] = sc.nextLine();
                }

                // Calculate score
                int score = calculateScore(correctAnswers, userAnswers);
                userScores.add(score);

                // Display result
                String grade = getGrade(score, correctAnswers.length);
                System.out.println("Score: " + score + "/" + correctAnswers.length);
                System.out.println("Grade: " + grade);
            }

            // Display all users' scores
            System.out.println("\nAll User Scores:");
            for (int s : userScores) {
                System.out.println(s);
            }

        } catch (InvalidQuizSubmissionException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
