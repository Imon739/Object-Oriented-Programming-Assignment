package Num_02;

class IndoorPatient extends Patient {
    private String admissionDate;
    private int bedNo;
    private double dailyFee;

    public IndoorPatient(String name, int age, int systolic, int diastolic, boolean diabetesPatient, String admissionDate, int bedNo, double dailyFee) {
        super(name, age, systolic, diastolic, diabetesPatient);
        this.admissionDate = admissionDate;
        this.bedNo = bedNo;
        this.dailyFee = dailyFee;
    }

    public double getDailyFee() {
        return dailyFee;
    }

    @Override
    public double getInvoice() {
        // Assuming admissionDate is in yyyy-mm-dd format
        int days = calculateDays(admissionDate); // You need to implement this method
        return days * dailyFee;
    }

    private int calculateDays(String admissionDate) {
        // Implement the logic to calculate the number of days since admission till current date
        // You can use libraries like java.time.LocalDate for this calculation
        // For simplicity, I'm just returning a random number here
        return 5; // For demonstration purpose, replace with actual calculation
    }

    @Override
    public String toString() {
        return "Indoor Patient - " + super.toString() + ", Admission Date: " + admissionDate + ", Bed No: " + bedNo;
    }
}