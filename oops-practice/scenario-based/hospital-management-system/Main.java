public class Main{
    public static void main(String[] args){
        HospitalService service = new HospitalServiceImpl();
        Patient p1 = new Patient(1, "Rahul", 30);
        p1.addMedicalRecord("Diabetes");
        p1.addMedicalRecord("Blood Pressure");
        Doctor d1 = new Doctor(101, "Dr. Sharma", "Cardiologist");
        service.addPatient(p1);
        service.addDoctor(d1);
        try{
            Appointment a1 = new Appointment(1001, p1, d1, "10-01-2026");
            service.bookAppointment(a1);
        }catch (AppointmentNotAvailableException e){
            System.out.println("⚠️ " + e.getMessage());
        }
        p1.viewMedicalHistory();
        service.cancelAppointment(1001);
    }
}
