import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ExamProctor exam = new ExamProctor();
        int choice;
        do{
            System.out.println("\nExam Menu");
            System.out.println("1. Visit Question");
            System.out.println("2. Save Answer");
            System.out.println("3. Submit Exam");
            System.out.println("4. Exit");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Question ID: ");
                    exam.visit(sc.nextInt());
                    break;
                case 2:
                    System.out.print("Question ID: ");
                    int q = sc.nextInt();
                    System.out.print("Answer: ");
                    exam.saveAnswer(q, sc.next());
                    break;
                case 3:
                    exam.showNavigation();
                    System.out.println("Score: " + exam.evaluate());
                    break;
            }
        } while (choice != 4);
    }
}
