package Num_03;

public abstract class Employee implements Comparable<Employee>{
    private String name;
    private int id;
    private int age;


    public Employee(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int compareTo(Employee sal){
        if(this.getSalary()<sal.getSalary()){
            return -1;
        }
        return Integer.compare(sal.getSalary(), this.getSalary());
    }
    public abstract int getSalary();

   
}
