package Num_03;

public class PartTimeEmployee extends Employee {
    private int hours;
    private int hourlyRate;
    int monthlySalary;

    public PartTimeEmployee(String name, int id, int age, int hours, int hourlyRate) {
        super(name, id, age);
        this.hours = hours;
        this.hourlyRate = hourlyRate;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHours() {
        return hours;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public int getSalary() {
        return getHours()*(getHourlyRate()+200);
    }

}
