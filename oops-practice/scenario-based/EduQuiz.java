import java.util.*;

public class EduQuiz{
    static int calculateScore(String[] correct, String[] student) {
        int score = 0;
        for (int i = 0; i < correct.length; i++) {
            if (correct[i].equalsIgnoreCase(student[i])) {
                System.out.println("Question " + (i + 1) + ": Correct");
                score++;
            } else {
                System.out.println("Question " + (i + 1) + ": Incorrect");
            }
        }
        return score;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] correctAnswers = {"A","B","C","D","A","C","B","D","A","B"};
        String[] studentAnswers = new String[10];
        System.out.println("Enter your answers:");
        for (int i = 0; i < 10; i++) {
            studentAnswers[i] = sc.next();
        }

        int score = calculateScore(correctAnswers, studentAnswers);
        double percentage = (score / 10.0) * 100;
        System.out.println("Score: " + score + "/10");
        System.out.println("Percentage: " + percentage + "%");
        if(percentage >= 40){
            System.out.println("Final Result: PASS");
        }else{
            System.out.println("Final Result: FAIL");
        }
    }
}
