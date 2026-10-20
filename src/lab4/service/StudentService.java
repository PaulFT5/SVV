package lab4.service;


import lab4.database.StudentDatabase;
import lab4.entity.Faculty;
import lab4.entity.Student;
import lab4.exception.NoStudentFoundException;

import java.util.List;

public class StudentService {
    private StudentDatabase studentDatabase;

    public void setStudentDatabase(StudentDatabase studentDatabase) {
        this.studentDatabase = studentDatabase;
    }

    public int countStudentsFromGivenYear(int year) {
        List<Student> allStudents = studentDatabase.getAll();

        int count = 0;

        for(Student s : allStudents) {
            if (s.getEnrollmentYear() == year) {
                count++;
            }
        }

        return count;
    }

    public void setPassingGradeToStudentWithName(String name) {
        Student foundStudent = studentDatabase.getByName(name);

        if (foundStudent == null) {
            throw new NoStudentFoundException("Student with name " + name + " has not been found.");
        }

        foundStudent.setFinalGrade(5);
        studentDatabase.update(foundStudent);
    }

    public double calculateAverageGradeForStudentsFromGivenFaculty(Faculty faculty) {
        List<Student> foundStudents = studentDatabase.getByFaculty(faculty);

        double avg = 0;
        int count = 0;

        for(Student s : foundStudents) {
            avg += s.getFinalGrade();
            count++;
        }

        return avg / count;
    }

    public void countStudentsFromFaculty(Faculty faculty) {
        // ToDo: Implement this method by yourself, using the method(s) available in StudentDatabase and test it.
    }

    public void deleteStudentsWhoDidntPass() {
        // ToDo: Implement this method by yourself, using the method(s) available in StudentDatabase and test it.
    }
}
