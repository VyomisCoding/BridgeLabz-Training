public class ProductManager extends JobRole {
    private int managedProjects;
    public ProductManager(String name, String content, int managedProjects){
        super(name, content);
        this.managedProjects = managedProjects;
    }
    @Override
    public void evaluateResume(){
        System.out.println("Product Manager Resume Screening:");
        System.out.println("Name: " + getCandidateName());
        System.out.println("Projects Managed: " + managedProjects);
        System.out.println("Resume Summary: " + getResumeContent());
        System.out.println("AI Verdict: Leadership + Strategy + Communication\n");
    }
}
