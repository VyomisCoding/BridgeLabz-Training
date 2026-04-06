import java.util.ArrayList;

class HospitalServiceImpl implements HospitalService {

    private ArrayList<Patient> patients = new ArrayList<>();
    private ArrayList<Doctor> doctors = new ArrayList<>();
    private ArrayList<Appointment> appointments = new ArrayList<>();

    @Override
    public void addPatient(Patient patient) {
        patients.add(patient);
        System.out.println("✅ Patient added: " + patient.name);
    }

    @Override
    public void deletePatient(int patientId) {
        patients.removeIf(p -> p.id == patientId);
        System.out.println("❌ Patient deleted");
    }

    @Override
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
        System.out.println("👨‍⚕️ Doctor added: " + doctor.name);
    }

    @Override
    public void bookAppointment(Appointment appointment)
            throws AppointmentNotAvailableException {

        for (Appointment a : appointments) {
            if (a.doctor.id == appointment.doctor.id &&
                a.date.equals(appointment.date)) {
                throw new AppointmentNotAvailableException(
                        "Doctor not available on this date");
            }
        }

        appointments.add(appointment);
        System.out.println("📅 Appointment booked successfully");
        System.out.println("💰 Consultation Fee: ₹" +
                appointment.doctor.calculateConsultationFee());
    }

    @Override
    public void cancelAppointment(int appointmentId) {
        appointments.removeIf(a -> a.appointmentId == appointmentId);
        System.out.println("❌ Appointment cancelled");
    }
}
