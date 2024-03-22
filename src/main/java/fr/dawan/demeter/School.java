package fr.dawan.demeter;

import java.util.List;

// Loi de déméter : une méthode peut appeler:
// - l'objet lui-même
// - les paramètres,
// - les variables locales
// - les attributs de l'objet

public class School {
    private List<Grade> grades;

    public School(List<Grade> grades) {
        this.grades = grades;
    }

    public long CountStudents() {
        return grades.stream().map(n -> n.countStudents()).reduce(0L, (a, b) -> a + b);
    }

    /* Ne respecte pas la loi de demeter (+ est moche)
    public long CountGrades() {
        long count = 0;
        for(var grade : grades) {
            for (var g : grade.getClasses()) {
                for(var s : g.getStudents()) {
                    count++;
                }
            }
        }
        return count;
    }
    */
}
