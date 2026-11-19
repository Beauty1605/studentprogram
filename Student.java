
import java.util.ArrayList;

public class Student {

    private int studentId;
    private String studentName;
    private String email;
    private String courseName;
    private double programmingScore;
    private double mathematicsScore;
    private ArrayList<String> technicalSkills;

    // Constructor
    public Student(int studentId, String studentName,
            String email, String courseName,
            double programmingScore, double mathematicsScore,
            ArrayList<String> technicalSkills) {

        this.studentId = studentId;
        this.studentName = studentName;
        this.email = email;
        this.courseName = courseName;
        this.programmingScore = programmingScore;
        this.mathematicsScore = mathematicsScore;
        this.technicalSkills = new ArrayList<>(technicalSkills);
    }

    // Getters
    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getEmail() {
        return email;
    }

    public String getCourseName() {
        return courseName;
    }

    public double getProgrammingScore() {
        return programmingScore;
    }

    public double getMathematicsScore() {
        return mathematicsScore;
    }

    public ArrayList<String> getTechnicalSkills() {
        return new ArrayList<>(technicalSkills);
    }

    // Setters
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setProgrammingScore(double score) {
        this.programmingScore = score;
    }

    public void setMathematicsScore(double score) {
        this.mathematicsScore = score;
    }

    public void setTechnicalSkills(ArrayList<String> skills) {
        this.technicalSkills = new ArrayList<>(skills);
    }

    // Object methods
    public double calculateAverage() {
        return (programmingScore + mathematicsScore) / 2;
    }

    public void displayDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Email: " + email);
        System.out.println("Course: " + courseName);
        System.out.println("Programming Score: " + programmingScore);
        System.out.println("Mathematics Score: " + mathematicsScore);
        System.out.println("Technical Skills: " + technicalSkills);
        System.out.println("Average: " + calculateAverage());
    }
}
