package University;
import java.util.ArrayList;
import java.util.Scanner;

public class menuApplication {
                private static Scanner scanner = new Scanner(System.in);
                private static ArrayList<Student> students = new ArrayList<>();
                private static ArrayList<Course> courses = new ArrayList<>();
                private static ArrayList<Faculty> faculties = new ArrayList<>();
        
                    while (true) {
                        displayMenu();
                        int choice = getChoice();
            
                        switch (choice) {
                            case 1:
                                handleAddOption();
                                break;
                            case 2:
                                handleDeleteOption();
                                break;
                            case 3:
                                handleUpdateOption();
                                break;
                            case 4:
                                handlePrintOption();
                                break;
                            case 5:
                                handleSearchOption();
                                break;
                            case 6:
                                System.out.println("Exiting University Management System. Goodbye!");
                                System.exit(0);
                            default:
                                System.out.println("Invalid choice. Please enter a valid option.");
                        }
                    }
                
            
                private static void displayMenu() {
                    System.out.println("University Management System");
                    System.out.println("1. Add");
                    System.out.println("2. Delete");
                    System.out.println("3. Update");
                    System.out.println("4. Print");
                    System.out.println("5. Search");
                    System.out.println("6. Exit");
                }
            
                private static int getChoice() {
                    System.out.print("Enter your choice: ");
                    return scanner.nextInt();
                }
            
                private static void handleAddOption() {
                    System.out.println("a. Add a Student");
                    System.out.println("b. Add a Course");
                    System.out.println("c. Add a Faculty");
                    System.out.println("d. Add student and their taken course");
                    System.out.println("e. Add Faculty and their taken course");
            
                    System.out.print("Enter your choice: ");
                    char addChoice = scanner.next().charAt(0);
            
                    switch (addChoice) {
                        case 'a':
                            addStudent();
                            break;
                        case 'b':
                            addCourse();
                            break;
                        case 'c':
                            addFaculty();
                            break;
                        case 'd':
                            addStudentAndCourse();
                            break;
                        case 'e':
                            addFacultyAndCourse();
                            break;
                        default:
                            System.out.println("Invalid choice.");
                    }
                }
            
                private static void handleDeleteOption() {
                    System.out.println("a. Delete a Student");
                    System.out.println("b. Delete a Course");
                    System.out.println("c. Delete a Faculty");
            
                    System.out.print("Enter your choice: ");
                    char deleteChoice = scanner.next().charAt(0);
            
                    switch (deleteChoice) {
                        case 'a':
                            deleteStudent();
                            break;
                        case 'b':
                            deleteCourse();
                            break;
                        case 'c':
                            deleteFaculty();
                            break;
                        default:
                            System.out.println("Invalid choice.");
                    }
                }
            
                private static void handleUpdateOption() {
                    System.out.println("a. Update a Student");
                    System.out.println("b. Update a Course");
                    System.out.println("c. Update a Faculty");
            
                    System.out.print("Enter your choice: ");
                    char updateChoice = scanner.next().charAt(0);
            
                    switch (updateChoice) {
                        case 'a':
                            updateStudent();
                            break;
                        case 'b':
                            updateCourse();
                            break;
                        case 'c':
                            updateFaculty();
                            break;
                        default:
                            System.out.println("Invalid choice.");
                    }
                }
            
                private static void handlePrintOption() {
                    System.out.println("a. Print all students");
                    System.out.println("b. Print all courses");
                    System.out.println("c. Print all faculties");
                    System.out.println("d. Print information of a student");
                    System.out.println("e. Print information of a course");
                    System.out.println("f. Print information of a faculty");
                    System.out.println("g. Print student list and faculty information of a course");
                    System.out.println("h. Print courses taken by a student");
            
                    System.out.print("Enter your choice: ");
                    char printChoice = scanner.next().charAt(0);
            
                    switch (printChoice) {
                        case 'a':
                            printAllStudents();
                            break;
                        case 'b':
                            printAllCourses();
                            break;
                        case 'c':
                            printAllFaculties();
                            break;
                        case 'd':
                            printStudentInfo();
                            break;
                        case 'e':
                            printCourseInfo();
                            break;
                        case 'f':
                            printFacultyInfo();
                            break;
                        case 'g':
                            printCourseDetails();
                            break;
                        case 'h':
                            printCoursesTakenByStudent();
                            break;
                        default:
                            System.out.println("Invalid choice.");
                    }
                }
            
                private static void handleSearchOption() {
                    System.out.println("a. Search a Student");
                    System.out.println("b. Search a Course");
                    System.out.println("c. Search a Faculty");
                    System.out.println("d. Search whether a student takes a course");
                    System.out.println("e. Search whether a faculty teaches a course");
                    System.out.println("f. Search courses taken by a student");
                    System.out.println("g. Search courses taught by a faculty");
            
                    System.out.print("Enter your choice: ");
                    char searchChoice = scanner.next().charAt(0);
            
                    switch (searchChoice) {
                        case 'a':
                            searchStudent();
                            break;
                        case 'b':
                            searchCourse();
                            break;
                        case 'c':
                            searchFaculty();
                            break;
                        case 'd':
                            searchStudentCourse();
                            break;
                        case 'e':
                            searchFacultyCourse();
                            break;
                        case 'f':
                            searchStudentCourses();
                            break;
                        case 'g':
                            searchFacultyCourses();
                            break;
                        default:
                            System.out.println("Invalid choice.");
                    }
                }
            
                // Add functionality methods
            
                private static void addStudent() {
                    System.out.print("Enter student ID: ");
                    int studentId = scanner.nextInt();
                    System.out.print("Enter student name: ");
                    String studentName = scanner.next();
                    System.out.print("Enter student CGPA: ");
                    double studentCGPA = scanner.nextDouble();
            
                    Student student = new Student(studentId, studentName, studentCGPA);
                    students.add(student);
            
                    System.out.println("Student added successfully.");
                }
            
                private static void addCourse() {
                    System.out.print("Enter course ID: ");
                    String courseId = scanner.next();
                    System.out.print("Enter course title: ");
                    String courseTitle = scanner.next();
                    System.out.print("Enter credit: ");
                    double credit = scanner.nextDouble();
            
                    Course course = new Course(courseId, courseTitle, credit);
                    courses.add(course);
            
                    System.out.println("Course added successfully.");
                }
            
                private static void addFaculty() {
                    System.out.print("Enter faculty ID: ");
                    int facultyId = scanner.nextInt();
                    System.out.print("Enter faculty name: ");
                    String facultyName = scanner.next();
                    System.out.print("Enter faculty position: ");
                    String facultyPosition = scanner.next();
            
                    Faculty faculty = new Faculty(facultyId, facultyName, facultyPosition);
                    faculties.add(faculty);
            
                    System.out.println("Faculty added successfully.");
                }
            
                private static void addStudentAndCourse() {
                    System.out.print("Enter student ID: ");
                    int studentId = scanner.nextInt();
                    System.out.print("Enter course ID: ");
                    String courseId = scanner.next();
            
                    Student student = findStudentById(studentId);
                    Course course = findCourseById(courseId);
            
                    if (student != null && course != null) {
                        course.addStudent(student);
                        System.out.println("Student added to the course successfully.");
                    } else {
                        System.out.println("Student or course not found.");
                    }
                }
            
                private static void addFacultyAndCourse() {
                    System.out.print("Enter faculty ID: ");
                    int facultyId = scanner.nextInt();
                    System.out.print("Enter course ID: ");
                    String courseId = scanner.next();
            
                    Faculty faculty = findFacultyById(facultyId);
                    Course course = findCourseById(courseId);
            
                    if (faculty != null && course != null) {
                        course.addFaculty(faculty);
                        System.out.println("Faculty added to the course successfully.");
                    } else {
                        System.out.println("Faculty or course not found.");
                    }
                }
            
                // Delete functionality methods
            
                private static void deleteStudent() {
                    System.out.print("Enter student ID to delete: ");
                    int studentId = scanner.nextInt();
                    students.removeIf(student -> student.getStudentId() == studentId);
                    System.out.println("Student deleted successfully.");
                }
            
                private static void deleteCourse() {
                    System.out.print("Enter course ID to delete: ");
                    String courseId = scanner.next();
                    courses.removeIf(course -> course.getCourseId().equals(courseId));
                    System.out.println("Course deleted successfully.");
                }
            
                private static void deleteFaculty() {
                    System.out.print("Enter faculty ID to delete: ");
                    int facultyId = scanner.nextInt();
                    faculties.removeIf(faculty -> faculty.getFacultyId() == facultyId);
                    System.out.println("Faculty deleted successfully.");
                }
            
                // Update functionality methods
            
                private static void updateStudent() {
                    System.out.print("Enter student ID to update: ");
                    int studentId = scanner.nextInt();
                    Student student = findStudentById(studentId);
            
                    if (student != null) {
                        System.out.println("Enter new details for the student:");
                        System.out.print("Enter student name: ");
                        String studentName = scanner.next();
                        System.out.print("Enter student CGPA: ");
                        double studentCGPA = scanner.nextDouble();
            
                        student.setStudentName(studentName);
                        student.setStudentCGPA(studentCGPA);
            
                        System.out.println("Student details updated successfully.");
                    } else {
                        System.out.println("Student not found.");
                    }
                }
            
                private static void updateCourse() {
                    System.out.print("Enter course ID to update: ");
                    String courseId = scanner.next();
                    Course course = findCourseById(courseId);
            
                    if (course != null) {
                        System.out.println("Enter new details for the course:");
                        System.out.print("Enter course title: ");
                        String courseTitle = scanner.next();
                        System.out.print("Enter credit: ");
                        double credit = scanner.nextDouble();
            
                        course.setCourseTitle(courseTitle);
                        course.setCredit(credit);
            
                        System.out.println("Course details updated successfully.");
                    } else {
                        System.out.println("Course not found.");
                    }
                }
            
                private static void updateFaculty() {
                    System.out.print("Enter faculty ID to update: ");
                    int facultyId = scanner.nextInt();
                    Faculty faculty = findFacultyById(facultyId);
            
                    if (faculty != null) {
                        System.out.println("Enter new details for the faculty:");
                        System.out.print("Enter faculty name: ");
                        String facultyName = scanner.next();
                        System.out.print("Enter faculty position: ");
                        String facultyPosition = scanner.next();
            
                        faculty.setFacultyName(facultyName);
                        faculty.setFacultyPosition(facultyPosition);
            
                        System.out.println("Faculty details updated successfully.");
                    } else {
                        System.out.println("Faculty not found.");
                    }
                }
            
                // Print functionality methods
            
                private static void printAllStudents() {
                    System.out.println("All Students:");
                    for (Student student : students) {
                        System.out.println(student);
                    }
                }
            
                private static void printAllCourses() {
                    System.out.println("All Courses:");
                    for (Course course : courses) {
                        System.out.println(course);
            }
            }
            // Print functionality methods (Continued)
    
    private static void printAllFaculties() {
        System.out.println("All Faculties:");
        for (Faculty faculty : faculties) {
            System.out.println(faculty);
        }
    }
    
    private static void printStudentInfo() {
        System.out.print("Enter student ID: ");
        int studentId = scanner.nextInt();
        Student student = findStudentById(studentId);
    
        if (student != null) {
            System.out.println("Student Information:");
            System.out.println(student);
        } else {
            System.out.println("Student not found.");
        }
    }
    
    private static void printCourseInfo() {
        System.out.print("Enter course ID: ");
        String courseId = scanner.next();
        Course course = findCourseById(courseId);
    
        if (course != null) {
            System.out.println("Course Information:");
            System.out.println(course);
        } else {
            System.out.println("Course not found.");
        }
    }
    
    private static void printFacultyInfo() {
        System.out.print("Enter faculty ID: ");
        int facultyId = scanner.nextInt();
        Faculty faculty = findFacultyById(facultyId);
    
        if (faculty != null) {
            System.out.println("Faculty Information:");
            System.out.println(faculty);
        } else {
            System.out.println("Faculty not found.");
        }
    }
    
    private static void printCourseDetails() {
        System.out.print("Enter course ID: ");
        String courseId = scanner.next();
        Course course = findCourseById(courseId);
    
        if (course != null) {
            course.printStudentList();
            course.printFacultyInfo();
        } else {
            System.out.println("Course not found.");
        }
    }
    
    private static void printCoursesTakenByStudent() {
        System.out.print("Enter student ID: ");
        int studentId = scanner.nextInt();
        Student student = findStudentById(studentId);
    
        if (student != null) {
            System.out.println("Courses taken by the student:");
            for (Course course : courses) {
                if (course.getStudentList().contains(student)) {
                    System.out.println(course);
                }
            }
        } else {
            System.out.println("Student not found.");
        }
    }
    
    // Search functionality methods
    
    private static void searchStudent() {
        System.out.print("Enter student ID to search: ");
        int studentId = scanner.nextInt();
        Student student = findStudentById(studentId);
    
        if (student != null) {
            System.out.println("Student found:");
            System.out.println(student);
        } else {
            System.out.println("Student not found.");
        }
    }
    
    private static void searchCourse() {
        System.out.print("Enter course ID to search: ");
        String courseId = scanner.next();
        Course course = findCourseById(courseId);
    
        if (course != null) {
            System.out.println("Course found:");
            System.out.println(course);
        } else {
            System.out.println("Course not found.");
        }
    }
    
    private static void searchFaculty() {
        System.out.print("Enter faculty ID to search: ");
        int facultyId = scanner.nextInt();
        Faculty faculty = findFacultyById(facultyId);
    
        if (faculty != null) {
            System.out.println("Faculty found:");
            System.out.println(faculty);
        } else {
            System.out.println("Faculty not found.");
        }
    }
    
    private static void searchStudentCourse() {
        System.out.print("Enter student ID: ");
        int studentId = scanner.nextInt();
        System.out.print("Enter course ID: ");
        String courseId = scanner.next();
    
        Student student = findStudentById(studentId);
        Course course = findCourseById(courseId);
    
        if (student != null && course != null) {
            if (course.getStudentList().contains(student)) {
                System.out.println("Student takes the course.");
            } else {
                System.out.println("Student does not take the course.");
            }
        } else {
            System.out.println("Student or course not found.");
        }
    }
    
    private static void searchFacultyCourse() {
        System.out.print("Enter faculty ID: ");
        int facultyId = scanner.nextInt();
        System.out.print("Enter course ID: ");
        String courseId = scanner.next();
    
        Faculty faculty = findFacultyById(facultyId);
        Course course = findCourseById(courseId);
    
        if (faculty != null && course != null) {
            if (course.getFaculty() != null && course.getFaculty().equals(faculty)) {
                System.out.println("Faculty teaches the course.");
            } else {
                System.out.println("Faculty does not teach the course.");
            }
        } else {
            System.out.println("Faculty or course not found.");
        }
    }
    
    private static void searchStudentCourses() {
        System.out.print("Enter student ID: ");
        int studentId = scanner.nextInt();
        Student student = findStudentById(studentId);
    
        if (student != null) {
            System.out.println("Courses taken by the student:");
            for (Course course : courses) {
                if (course.getStudentList().contains(student)) {
                    System.out.println(course);
                }
            }
        } else {
            System.out.println("Student not found.");
        }
    }
    
    private static void searchFacultyCourses() {
        System.out.print("Enter faculty ID: ");
        int facultyId = scanner.nextInt();
        Faculty faculty = findFacultyById(facultyId);
    
        if (faculty != null) {
            System.out.println("Courses taught by the faculty:");
            for (Course course : courses) {
                if (course.getFaculty() != null && course.getFaculty().equals(faculty)) {
                    System.out.println(course);
                }
            }
        } else {
            System.out.println("Faculty not found.");
        }
    }
    
    // Utility methods
    
    private static Student findStudentById(int studentId) {
        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                return student;
            }
        }
        return null;
    }
    
    private static Course findCourseById(String courseId) {
        for (Course course : courses) {
            if (course.getCourseId().equals(courseId)) {
                return course;
            }
        }
        return null;
    }
    
    private static Faculty findFacultyById(int facultyId) {
        for (Faculty faculty : faculties) {
            if (faculty.getFacultyId() == facultyId) {
                return faculty;
            }
        }
        return null;
    }
    
    }