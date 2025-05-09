package University;

public class Student {
    private int studentId;
    private String studentName;
    private double studentCgpa;
    public Student() {
    }
    public Student(int studentId, String studentName, double studentCgpa) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentCgpa = studentCgpa;
    }
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public double getStudentCgpa() {
        return studentCgpa;
    }
    public void setStudentCgpa(double studentCgpa) {
        this.studentCgpa = studentCgpa;
    }
    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentCgpa=" + studentCgpa
                + "]";
    }
    
}
