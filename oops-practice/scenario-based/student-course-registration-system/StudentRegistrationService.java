class StudentRegistrationService implements RegistrationService{
    @Override
    public void enroll(Student student, Course course) throws CourseLimitExceededException{
        if (!student.canEnroll()){
            throw new CourseLimitExceededException("Course limit exceeded (Max 3)");
        }
        student.getCourses().add(course);
        System.out.println(" Enrolled in: " + course.courseName);
    }
    @Override
    public void drop(Student student, Course course){
        student.getCourses().remove(course);
        System.out.println(" Dropped course: " + course.courseName);
    }
    @Override
    public void assignGrade(Student student, String grade){
        student.getGrades().add(grade);
        System.out.println(" Grade Assigned: " + grade);
    }
}
