import java.util.*;

interface MedicalRecord{  // Medical record interface
    void addRecord(String record);
    void viewRecords();
}

// Abstract Patient class
abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    protected ArrayList<String> medicalHistory = new ArrayList<>();

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("Patient Name : " + name);
        System.out.println("Age          : " + age);
    }
}

// In-patient
class InPatient extends Patient implements MedicalRecord {

    public InPatient(int patientId, String name, int age) {
        super(patientId, name, age);
    }

    @Override
    public double calculateBill() {
        return 8000; // room + treatment charges
    }

    @Override
    public void addRecord(String record) {
        medicalHistory.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical History : " + medicalHistory);
    }
}

// Out-patient
class OutPatient extends Patient implements MedicalRecord {

    public OutPatient(int patientId, String name, int age) {
        super(patientId, name, age);
    }

    @Override
    public double calculateBill() {
        return 1500; // consultation charges
    }

    @Override
    public void addRecord(String record) {
        medicalHistory.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical History : " + medicalHistory);
    }
}


public class HospitalPatientManagement {
    public static void main(String[] args) {

        ArrayList<Patient> patients = new ArrayList<>();

        Patient p1 = new InPatient(1, "Rahul", 45);
        Patient p2 = new OutPatient(2, "Sneha", 28);

        ((MedicalRecord) p1).addRecord("Admitted for surgery");
        ((MedicalRecord) p2).addRecord("Fever and cold");

        patients.add(p1);
        patients.add(p2);

        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Bill Amount : " + p.calculateBill());
            ((MedicalRecord) p).viewRecords();
            System.out.println("-------------------------");
        }
    }
}
