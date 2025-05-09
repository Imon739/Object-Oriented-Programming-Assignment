package Num_01;

import java.util.Collections;

class University implements Comparable<University> {
    private String name;
    private String address;
    private int dateEstablished;
    private int numberOfDepartments;

    public University(String name, String address, int numberOfDepartments, int dateEstablished) {
        this.name = name;
        this.address = address;
        this.dateEstablished = dateEstablished;
        this.numberOfDepartments = numberOfDepartments;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getDateEstablished() {
        return dateEstablished ;
    }

    public int getNumberOfDepartments() {
        return numberOfDepartments;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Address: " + address + ", Established: " + dateEstablished + ", Departments: " + numberOfDepartments;
    }

    public int compareTo(University e1){
        return Integer.compare(getDateEstablished(), e1.dateEstablished);
    }


    
}


