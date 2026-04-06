import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Resume<SoftwareEngineer> seList = new Resume<>();
        Resume<DataScientist> dsList = new Resume<>();
        Resume<ProductManager> pmList = new Resume<>();
        while(true){
            System.out.println("\n--AI-Driven Resume Screening System--");
            System.out.println("1. Add Software Engineer Resume");
            System.out.println("2. Add Data Scientist Resume");
            System.out.println("3. Add Product Manager Resume");
            System.out.println("4. Run AI Screening for All");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            sc.nextLine(); // flush
            switch(ch){
                case 1:
                    System.out.print("Enter Candidate Name: ");
                    String sname = sc.nextLine();
                    System.out.print("Enter Resume Summary: ");
                    String sresume = sc.nextLine();
                    System.out.print("Enter Core Programming Language: ");
                    String lang = sc.nextLine();
                    seList.addResume(new SoftwareEngineer(sname, sresume, lang));
                    System.out.println("Software Engineer Resume Added!");
                    break;
                case 2:
                    System.out.print("Enter Candidate Name: ");
                    String dname = sc.nextLine();
                    System.out.print("Enter Resume Summary: ");
                    String dresume = sc.nextLine();
                    System.out.print("Enter Primary Tool (Python/R/SQL): ");
                    String tool = sc.nextLine();
                    dsList.addResume(new DataScientist(dname, dresume, tool));
                    System.out.println("Data Scientist Resume Added!");
                    break;
                case 3:
                    System.out.print("Enter Candidate Name: ");
                    String pname = sc.nextLine();
                    System.out.print("Enter Resume Summary: ");
                    String presume = sc.nextLine();
                    System.out.print("Enter Number of Managed Projects: ");
                    int projects = sc.nextInt();
                    sc.nextLine();
                    pmList.addResume(new ProductManager(pname, presume, projects));
                    System.out.println("Product Manager Resume Added!");
                    break;
                case 4:
                    System.out.println("\n-SOFTWARE ENGINEERS-");
                    ResumeScreeningUtil.showAllCandidates(seList.getAllResumes());
                    System.out.println("\n-DATA SCIENTISTS-");
                    ResumeScreeningUtil.showAllCandidates(dsList.getAllResumes());
                    System.out.println("\n-PRODUCT MANAGERS-");
                    ResumeScreeningUtil.showAllCandidates(pmList.getAllResumes());
                    break;
                case 5:
                    System.out.println("Exiting System.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
