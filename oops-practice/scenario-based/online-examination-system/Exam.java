import java.util.ArrayList;

public class Exam{
    int examId;
    String subject;
    int durationMinutes;
    ArrayList<Question> questions = new ArrayList<>();

    Exam(int examId, String subject, int durationMinutes) {
        this.examId = examId;
        this.subject = subject;
        this.durationMinutes = durationMinutes;
    }
    
    void addQuestion(Question q) {
        questions.add(q);
    }
}
