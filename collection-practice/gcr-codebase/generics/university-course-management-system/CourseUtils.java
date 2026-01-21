import java.util.List;

public class CourseUtils{
    public static void displayAllCourses(List<? extends CourseType> courseList){        // Wildcard ? extends CourseType → accepts ANY type of course
        System.out.println("\n--- Course Catalog ---");
        for(CourseType course : courseList){
            course.showEvaluationMethod();
        }
    }
}
