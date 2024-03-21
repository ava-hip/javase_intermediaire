package fr.dawan.creation.prototype;

import java.util.ArrayList;
import java.util.List;

public class Quizz implements Cloneable{
    private String titre;
    private List<Question> questions = new ArrayList<>();

    public Quizz(String titre) {
        this.titre = titre;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void addQuestions(Question question) {
        questions.add(question);
    }

    @Override
    public String toString() {
        return "Quizz{" +
                "titre='" + titre + '\'' +
                ", questions=" + questions +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Quizz quizz = (Quizz)super.clone();
        quizz.questions = new ArrayList<>();
        for (Question question : questions) {
            quizz.questions.add((Question)question.clone());
        }
        return quizz;
    }
}
