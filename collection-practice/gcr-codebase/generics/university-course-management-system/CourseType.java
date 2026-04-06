
public abstract class CourseType{    // Base abstract class for different evaluation methods
    private String courseName;
    private int credits;
    public CourseType(String courseName, int credits){
        this.courseName = courseName;
        this.credits = credits;
    }
    public String getCourseName(){
        return courseName;
    }

    public int getCredits(){
        return credits;
    }

    public abstract void showEvaluationMethod();     // Each course type explains how it is evaluated
}
