package Num_02;

class Patient implements Comparable<Patient> {
    private String name;
    private int age;
    private int systolic;
    private int diastolic;
    private boolean diabetesPatient;

    public Patient(String name, int age, int systolic, int diastolic, boolean diabetesPatient) {
        this.name = name;
        this.age = age;
        this.systolic = systolic;
        this.diastolic = diastolic;
        this.diabetesPatient = diabetesPatient;
    }

   
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSystolic() {
        return systolic;
    }

    public int getDiastolic() {
        return diastolic;
    }

    public boolean isDiabetesPatient() {
        return diabetesPatient;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Systolic: " + systolic + ", Diastolic: " + diastolic +
                ", Diabetes Patient: " + diabetesPatient;
    }

    @Override
    public int compareTo(Patient other) {
        return other.age - this.age; 
    }

   
    public double getInvoice() {
        return 0.0;
    }
}