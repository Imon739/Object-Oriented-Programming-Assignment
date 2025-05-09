package Num_03;

public class FullTimeEmployee extends Employee{
    private int monthlySalary;

    public FullTimeEmployee(String name, int id, int age, int monthlySalary) {
        super(name, id, age);
        this.monthlySalary = monthlySalary;
    }

    public int getSalary() {
        return monthlySalary;
    }

    public void setSalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }


}
