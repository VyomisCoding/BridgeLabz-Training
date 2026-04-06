import java.util.ArrayList;

class Patient extends Person{
    private int age;
    private ArrayList<String> medicalHistory;

    Patient(int id, String name, int age){
        super(id, name);
        this.age = age;
        this.medicalHistory = new ArrayList<>();
    }
    public void addMedicalRecord(String record){
        medicalHistory.add(record);
    }
    public void viewMedicalHistory(){
        System.out.println("📄 Medical History of " + name);
        for (String record : medicalHistory) {
            System.out.println("- " + record);
        }
    }
}
