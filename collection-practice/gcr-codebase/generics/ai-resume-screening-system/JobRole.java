public abstract class JobRole{
    private String candidateName;
    private String resumeContent;
    public JobRole(String candidateName, String resumeContent){
        this.candidateName = candidateName;
        this.resumeContent = resumeContent;
    }
    public String getCandidateName(){
        return candidateName;
    }
    public String getResumeContent(){
        return resumeContent;
    }
    // Each role must define how AI evaluates
    public abstract void evaluateResume();
}
