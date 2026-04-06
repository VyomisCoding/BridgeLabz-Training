
import java.util.Arrays;
import java.util.List;

class Patient{
    String name;
    int id;
    Patient(String name, int id){
        this.name = name;
        this.id = id;
    }

    void printID(){
        System.out.println("Patient ID: " + id);
    }
}
public class HospitalPatientId{
    public static void main(String[] args){
        List<Patient> patients = Arrays.asList(
            new Patient("Wilson", 101),
            new Patient("Bhargav", 102),
            new Patient("Charles", 103)
        );

        patients.forEach(Patient::printID);         // Lambda to extract patient IDs
        
    }
    
}