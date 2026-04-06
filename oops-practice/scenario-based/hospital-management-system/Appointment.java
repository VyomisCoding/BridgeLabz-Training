class Appointment{
    int appointmentId;
    Patient patient;
    Doctor doctor;
    String date;

    Appointment(int appointmentId, Patient patient, Doctor doctor, String date){
        this.appointmentId = appointmentId;
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
    }
}
