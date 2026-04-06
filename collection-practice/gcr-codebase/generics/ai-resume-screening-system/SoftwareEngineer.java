public class SoftwareEngineer extends JobRole{
    private String programmingLanguage;
    public SoftwareEngineer(String name, String content, String programmingLanguage){
        super(name, content);
        this.programmingLanguage = programmingLanguage;
    }
    @Override
    public void evaluateResume(){
        System.out.println("Software Engineer Resume Screening:");
        System.out.println("Name: " + getCandidateName());
        System.out.println("Core Skill: " + programmingLanguage);
        System.out.println("Resume Summary: " + getResumeContent());
        System.out.println("AI Verdict: Code Quality + DSA + System Design\n");
    }
}
