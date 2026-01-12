interface RegistrationService{
    void enroll(Student student, Course course) throws CourseLimitExceededException;
    void drop(Student student, Course course);
    void assignGrade(Student student, String grade);
}
