package fr.dawan.demeter;

import java.util.List;

public class Grade {
    private List<StudentClass> classes;

    public Grade(List<StudentClass> classes) {
        this.classes = classes;
    }

//    public List<StudentClass> getClasses() {
//        return classes;
//    }

    public long countStudents() {
        return classes.stream().map(c -> c.countStudents()).reduce(0L, (a, b) -> a + b);
    }
}
