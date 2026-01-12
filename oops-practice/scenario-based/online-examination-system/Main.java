import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Student student = new Student(1, "Vyomesh");

        Exam exam = new Exam(101, "Java", 60);

        exam.addQuestion(new Question(1, "What is JVM?", "Java Virtual Machine"));
        exam.addQuestion(new Question(2, "What is OOP?", "Object Oriented Programming"));

        ArrayList<String> answers = new ArrayList<>();
        answers.add("Java Virtual Machine");
        answers.add("Object Oriented Programming");

        EvaluationStrategy evaluation = new ObjectiveEvaluation(); // Polymorphism

        try {
            submitExam(exam, 55); // time taken in minutes
            int result = evaluation.evaluate(exam.questions, answers);
            System.out.println("✅ Exam submitted successfully");
            System.out.println("📊 Score: " + result);
        } catch (ExamTimeExpiredException e) {
            System.out.println("⚠️ " + e.getMessage());
        }
    }

    static void submitExam(Exam exam, int timeTaken)
            throws ExamTimeExpiredException {

        if (timeTaken > exam.durationMinutes) {
            throw new ExamTimeExpiredException("Exam time expired");
        }
    }
}
