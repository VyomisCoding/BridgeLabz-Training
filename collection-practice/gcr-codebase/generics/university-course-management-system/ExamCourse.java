public class ExamCourse extends CourseType{
    private int examMarks;
    public ExamCourse(String name, int credits, int examMarks){
        super(name, credits);
        this.examMarks = examMarks;
    }
    @Override
    public void showEvaluationMethod(){
        System.out.println(getCourseName() + " | Credits: " + getCredits() + " | Evaluation: Final Exam (" + examMarks + " marks)");
    }
}
