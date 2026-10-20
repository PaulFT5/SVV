package lab4.entity;

public class Student {
    private String name;
    private int enrollmentYear;
    private Faculty faculty;
    private double finalGrade;

    public Student(String name, int enrollmentYear, Faculty faculty, double finalGrade) {
        this.name = name;
        this.enrollmentYear = enrollmentYear;
        this.faculty = faculty;
        this.finalGrade = finalGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnrollmentYear() {
        return enrollmentYear;
    }

    public void setEnrollmentYear(int enrollmentYear) {
        this.enrollmentYear = enrollmentYear;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public double getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(double finalGrade) {
        this.finalGrade = finalGrade;
    }
}
