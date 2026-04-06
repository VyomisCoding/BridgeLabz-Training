import java.util.*;

class ObjectiveEvaluation implements EvaluationStrategy{
    @Override
    public int evaluate(ArrayList<Question> questions, ArrayList<String> answers){
        int score = 0;
        for (int i = 0; i < questions.size(); i++){
            if (questions.get(i).correctAnswer.equalsIgnoreCase(answers.get(i))){
                score += 1;
            }
        }
        return score;
    }
}
