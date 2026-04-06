import java.util.List;

public class ResumeScreeningUtil{
    
    public static <T extends JobRole> void runAIScreening(T role){    // Generic Method
        System.out.println("Running AI Screening...");
        role.evaluateResume();
    }

    public static void showAllCandidates(List<? extends JobRole> list){    // Wildcard Method
        System.out.println("\n--- AI Screening Pipeline ---");
        for (JobRole r : list){
            r.evaluateResume();
        }
    }
}
