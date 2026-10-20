package lab4.database;
import lab4.entity.Faculty;
import lab4.entity.Student;

import java.util.List;

public interface StudentDatabase {
    List<Student> getAll();
    List<Student> getByFaculty(Faculty faculty);
    Student getByName(String name);
    void update(Student s);
    void delete(Student s);
}
