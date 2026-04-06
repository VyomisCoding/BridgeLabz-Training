public class DataScientist extends JobRole{
    private String primaryTool;
    public DataScientist(String name, String content, String primaryTool){
        super(name, content);
        this.primaryTool = primaryTool;
    }
    @Override
    public void evaluateResume(){
        System.out.println("Data Scientist Resume Screening:");
        System.out.println("Name: " + getCandidateName());
        System.out.println("Primary Tool: " + primaryTool);
        System.out.println("Resume Summary: " + getResumeContent());
        System.out.println("AI Verdict: ML Skills + Statistics + Python Expertise\n");
    }
}
