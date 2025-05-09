package Num_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Patient> patients = new ArrayList<>();

        for (int i = 0; i < 1; i++) {
            System.out.println("Enter details for Indoor Patient " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.print("Systolic: ");
            int systolic = Integer.parseInt(scanner.nextLine());
            System.out.print("Diastolic: ");
            int diastolic = Integer.parseInt(scanner.nextLine());
            System.out.print("Diabetes Patient (true/false): ");
            boolean diabetesPatient = Boolean.parseBoolean(scanner.nextLine());
            System.out.print("Admission Date (yyyy-mm-dd): ");
            String admissionDate = scanner.nextLine();
            System.out.print("Bed No: ");
            int bedNo = Integer.parseInt(scanner.nextLine());
            System.out.print("Daily Fee: ");
            double dailyFee = Double.parseDouble(scanner.nextLine());

            IndoorPatient patient = new IndoorPatient(name, age, systolic, diastolic, diabetesPatient, admissionDate, bedNo, dailyFee);
            patients.add(patient);
        }

        for (int i = 0; i < 1; i++) {
            System.out.println("Enter details for Outdoor Patient " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.print("Systolic: ");
            int systolic = Integer.parseInt(scanner.nextLine());
            System.out.print("Diastolic: ");
            int diastolic = Integer.parseInt(scanner.nextLine());
            System.out.print("Diabetes Patient (true/false): ");
            boolean diabetesPatient = Boolean.parseBoolean(scanner.nextLine());
            System.out.print("Specialty: ");
            String specialty = scanner.nextLine();
            System.out.print("Consultation Fee: ");
            double consultationFee = Double.parseDouble(scanner.nextLine());

            OutdoorPatient patient = new OutdoorPatient(name, age, systolic, diastolic, diabetesPatient, specialty, consultationFee);
            patients.add(patient);
        }
        Collections.sort(patients);

        System.out.println("Patients with high or low blood pressure:");
        for (Patient patient : patients) {
            if (patient.getSystolic() > 120 || patient.getDiastolic() < 80) {
                System.out.println(patient);
            }
        }

        System.out.println("\n");
        for (Patient patient : patients) {
            if (patient instanceof IndoorPatient) {
                System.out.println("Indoor");
            } else if (patient instanceof OutdoorPatient) {
                System.out.println("Outdoor");
            }
            System.out.println(patient);
            System.out.println("Invoice: " + patient.getInvoice());
            System.out.println();
        }
    }
}