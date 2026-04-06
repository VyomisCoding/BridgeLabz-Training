public class AssignmentCourse extends CourseType{
    private int numberOfAssignments;
    public AssignmentCourse(String name, int credits, int numberOfAssignments){
        super(name, credits);
        this.numberOfAssignments = numberOfAssignments;
    }
    @Override
    public void showEvaluationMethod(){
        System.out.println(getCourseName() + " | Credits: " + getCredits() + " | Evaluation: " + numberOfAssignments + " Assignments");
    }
}
