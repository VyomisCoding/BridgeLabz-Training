interface HospitalService {
    void addPatient(Patient patient);
    void deletePatient(int patientId);
    void addDoctor(Doctor doctor);
    void bookAppointment(Appointment appointment) throws AppointmentNotAvailableException;
    void cancelAppointment(int appointmentId);
}
