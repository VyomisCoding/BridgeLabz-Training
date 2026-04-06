import java.util.*;

public class ExamProctor{
    Stack<Integer> navigation = new Stack<>();
    HashMap<Integer, String> answers = new HashMap<>();
    HashMap<Integer, String> correct = new HashMap<>();

    public ExamProctor(){
        correct.put(1, "A");
        correct.put(2, "B");
        correct.put(3, "C");
    }

    public void visit(int q){
        navigation.push(q);
    }

    public void saveAnswer(int q, String ans){
        answers.put(q, ans);
    }

    public int evaluate(){
        int score = 0;
        for(int q : answers.keySet()){
            if(answers.get(q).equalsIgnoreCase(correct.get(q))){
                score++;
            }
        }
        return score;
    }

    public void showNavigation(){
        System.out.println("Navigation Stack: " + navigation);
    }
}
