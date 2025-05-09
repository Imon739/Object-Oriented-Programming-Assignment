package University;

import java.util.ArrayList;

public class Course {
    private String courseCode;
    private String courseTitle;
    private double credit;
    private ArrayList<Student> studentlist = new ArrayList<>();
    private int numberOfStudents=0;
    private Faculty faculty;
    public Course() {
    }
    public Course(String courseCode, String courseTitle, double credit) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.credit = credit;
    }
    public String getCourseCode() {
        return courseCode;
    }
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    public String getCourseTitle() {
        return courseTitle;
    }
    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }
    public double getCredit() {
        return credit;
    }
    public void setCredit(double credit) {
        this.credit = credit;
    }
    public void addStudent(Student s){
        boolean flag = true;
        for(Student s1: studentlist){
            if(s1.getStudentId() == s.getStudentId()){
                flag = false;
                break;
            }
        }
        if(flag){
            this.studentlist.add(s);
            this.numberOfStudents++;
            System.out.println("Student with ID: " + s.getStudentId() + " added to the course: " + courseCode);
        }
        else{
            System.out.println("Student already exists in the course");
        }
    }
    public void dropStudent(int studentId){
        int sIdx = -1;
        for(int i = 0; i<studentlist.size(); i++){
            if(studentlist.get(i).getStudentId() == studentId){
                sIdx = i;
                break;
            }
        }
        if(sIdx!=-1){
            studentlist.remove(sIdx);
            numberOfStudents--;
            System.out.println("Student removed from the course!");
        }
        else{
            System.out.println("Student doesn't exist!");
        }
    }
    public void printStudentList(){
        System.out.println("Students in the course " + courseCode + " are: ");
        for(Student s: studentlist){
            System.out.println(s.toString());
        }
    }
    public void dropFaculty() {
        this.faculty = null;
    }
    public void addFaculty(Faculty faculty) {
        this.faculty = faculty;
    }
    public Faculty getFaculty(){
        return this.faculty;
    }
    @Override
    public String toString() {
        return "Course [courseCode=" + courseCode + ", courseTitle=" + courseTitle + ", credit=" + credit + "]";
    }
    
}
