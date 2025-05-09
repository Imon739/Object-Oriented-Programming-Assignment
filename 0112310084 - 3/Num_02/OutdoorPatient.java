package Num_02;

class OutdoorPatient extends Patient {
    private String specialty;
    private double consultationFee;

    public OutdoorPatient(String name, int age, int systolic, int diastolic, boolean diabetesPatient, String specialty, double consultationFee) {
        super(name, age, systolic, diastolic, diabetesPatient);
        this.specialty = specialty;
        this.consultationFee = consultationFee;
    }

    public double getConsultationFee() {
        return consultationFee;
    }

    @Override
    public double getInvoice() {
        return consultationFee;
    }

    @Override
    public String toString() {
        return "Outdoor Patient - " + super.toString() + ", Specialty: " + specialty;
    }
}