package Num_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<University> universities = new ArrayList<>();

        for (int i = 0; i < 1; i++) {
            System.out.println("Enter details for Public University " + (i + 1));
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Address: ");
            String address = scanner.nextLine();
            System.out.print("Established Year: ");
            int dateEstablished = scanner.nextInt();
            System.out.print("Number of Departments: ");
            int numberOfDepartments = scanner.nextInt();
            System.out.print("Number of Halls: ");
            int numberOfHalls = scanner.nextInt();
            System.out.print("Politics Allowed (true/false): ");
            boolean politicsAllowed = scanner.nextBoolean();
            scanner.nextLine(); 
            universities.add(new PublicUniversity(name, address, numberOfDepartments, dateEstablished, numberOfHalls, politicsAllowed));
        }

        for (int i = 0; i < 1; i++) {
            System.out.println("Enter details for Private University " + (i + 1));
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Address: ");
            String address = scanner.nextLine();
            System.out.print("Established Year: ");
            int dateEstablished = scanner.nextInt();
            System.out.print("Number of Departments: ");
            int numberOfDepartments = scanner.nextInt();
            System.out.print("UGC Approved (true/false): ");
            boolean ugcApproved = scanner.nextBoolean();
            System.out.print("Number of Trustee Members: ");
            int numberOfTrusteeMember = scanner.nextInt();
            scanner.nextLine(); 
            universities.add(new PrivateUniversity(name, address, dateEstablished, numberOfDepartments, ugcApproved, numberOfTrusteeMember));
        }

        Collections.sort(universities);

       
        System.out.println("\nUGC Approved Universities:");
        for (University uni : universities) {
            if (uni instanceof PrivateUniversity && ((PrivateUniversity) uni).isUgcApproved()) {
                System.out.println(uni);
            }
        }

        
        System.out.println("\nUniversities where politics are not allowed:");
        for (University uni : universities) {
            if (uni instanceof PublicUniversity && !((PublicUniversity) uni).isPoliticsAllowed()) {
                System.out.println(uni);
            }
        }

        
        System.out.print("\nEnter address to display universities from that address: ");
        String UniAddress = scanner.nextLine();
        System.out.println("Universities from " + UniAddress + ":");
        for (University uni : universities) {
            if (uni.getAddress().equalsIgnoreCase(UniAddress)) {
                System.out.println(uni);
            }
        }


        System.out.println("\nDetails of every university:");
        for (University uni : universities) {
            if (uni instanceof PublicUniversity) {
                System.out.println("Public " + uni + ", Halls: " + ((PublicUniversity) uni).getNumberOfHalls() + ", Politics Allowed: " + ((PublicUniversity) uni).isPoliticsAllowed());
            } else if (uni instanceof PrivateUniversity) {
                System.out.println("Private " + uni + ", UGC Approved: " + ((PrivateUniversity) uni).isUgcApproved() + ", Trustee Members: " + ((PrivateUniversity) uni).getNumberOfTrusteeMember());
            }
        }
    }

}
