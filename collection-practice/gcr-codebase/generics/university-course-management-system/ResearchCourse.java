public class ResearchCourse extends CourseType{
    private String researchTopic;
    public ResearchCourse(String name, int credits, String researchTopic){
        super(name, credits);
        this.researchTopic = researchTopic;
    }
    @Override
    public void showEvaluationMethod(){
        System.out.println(getCourseName() + " | Credits: " + getCredits() + " | Evaluation: Research Project (" + researchTopic + ")");
    }
}
