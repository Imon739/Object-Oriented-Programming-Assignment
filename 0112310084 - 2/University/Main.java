package University;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(121, "Alice", 3.8);
        Student s2 = new Student(122, "Bob", 2.8);
        Student s3 = new Student(123, "Charlie", 3.9);
        Student s4 = new Student(124, "Danny", 3.2);
        Faculty f1 = new Faculty(1, "Paul", "Professor");
        Faculty f2 = new Faculty(2, "Layne", "Lecturer");
        Course c1 = new Course("CSE1111", "SPL", 3.0);
        Course c2 = new Course("CSE1116", "OOP Lab", 1.0);
        c1.addStudent(s1);
        c1.addStudent(s2);
        c1.addStudent(s2);
        c2.addStudent(s1);
        c2.addStudent(s4);
        c1.addFaculty(f2);
        c2.addFaculty(f1);
        c1.printStudentList();
        System.out.println(c1.getFaculty());
        c2.printStudentList();
        System.out.println(c2.getFaculty());
        c1.dropStudent(123);
        c1.dropStudent(121);
        c1.printStudentList();


    }
}
