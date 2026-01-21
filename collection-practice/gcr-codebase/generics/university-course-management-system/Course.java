import java.util.ArrayList;
import java.util.List;

public class Course<T extends CourseType>{     // Generic Class  T is restricted to CourseType
    private List<T> offeredCourses = new ArrayList<>();
    
    public void addCourse(T course){     // Add a new course
        offeredCourses.add(course);
    }
    
    public List<T> getAllCourses(){      // Get all courses
        return offeredCourses;
    }
}
