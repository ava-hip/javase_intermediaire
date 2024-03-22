package fr.dawan.demeter;

import java.util.List;

public class StudentClass {
    private List<Student> students;

    public StudentClass(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public long countStudents() {
        return students.size();
    }
}
