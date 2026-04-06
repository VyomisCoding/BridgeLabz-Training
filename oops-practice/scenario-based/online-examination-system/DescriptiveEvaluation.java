import java.util.ArrayList;

class DescriptiveEvaluation implements EvaluationStrategy {

    @Override
    public int evaluate(ArrayList<Question> questions, ArrayList<String> answers) {
        // Simple logic: manual/average based evaluation
        return questions.size() * 2; // fixed marks for demo
    }
}
