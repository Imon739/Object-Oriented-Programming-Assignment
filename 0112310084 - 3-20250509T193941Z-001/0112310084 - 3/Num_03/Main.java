package Num_03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    static ArrayList<Employee> employees = new ArrayList<>();
    public static void printEmployeesByBirthYear(ArrayList<Employee>employees, int birthYear) {
        for (Employee emp : employees) {
            if (emp.getAge() == birthYear) {
                System.out.println(emp);
            }
        }
    }

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);

        for(int i=0;i<1;i++){
            System.out.println("DETAILS OF Full Time EMPLOYEE: "+ (i+1));
            System.out.println("Name: ");
            String name = input.nextLine();
            System.out.println("ID: ");
            int id = input.nextInt();
            System.out.println("Age in years: ");
            int age = input.nextInt();
            System.out.println("Salary: ");
            int salary = input.nextInt();
            input.nextLine();

            employees.add(new FullTimeEmployee(name, id, age , salary));
        }

        for(int i=0;i<1;i++){
            System.out.println("DETAILS OF Part Time EMPLOYEE: "+ (i+1));
            System.out.println("Name: ");
            String name = input.nextLine();
            System.out.println("ID: ");
            int id = input.nextInt();
            System.out.println("Age in years: ");
            int age = input.nextInt();
            System.out.println("Hours: ");
            int hours = input.nextInt();
            System.out.println("Hourly Rate: ");
            int hourlyRate= input.nextInt();
            input.nextLine();

            employees.add(new PartTimeEmployee(name, id, age, hours, hourlyRate));
        }
        Collections.sort(employees);

        System.out.println("\nDetails of every Employee:");
        for (Employee emp : employees) {
            if (emp instanceof FullTimeEmployee) {
                System.out.println("FullTime:  " + emp + ", ID:  " + ((FullTimeEmployee) emp).getId() + ", Monthly Salary:  " + ((FullTimeEmployee)emp).getSalary());
            } else if (emp instanceof PartTimeEmployee) {
                System.out.println("Part Time: "+emp+", ID: "+((PartTimeEmployee)emp).getId()+ ", Hours: "+((PartTimeEmployee)emp).getHours()+", Hourly Rate: "+((PartTimeEmployee)emp).getHourlyRate()+ ", Salary: "+((PartTimeEmployee)emp).getSalary());
            }
        }
    }
   
}
