class Doctor extends Person {

    private String specialization;
    Doctor(int id, String name, String specialization){
        super(id, name);
        this.specialization = specialization;
    }
    
    public double calculateConsultationFee(){    // Polymorphism: Consultation Fee
        return 500;     // default
    }
    public String getSpecialization(){
        return specialization;
    }
}
