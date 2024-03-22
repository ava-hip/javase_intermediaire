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
        StringBuilder builder = new StringBuilder();
        builder.append("Quiz [titre=").append(titre).append(", questions=").append(questions).append("]");
        return builder.toString();
    }

    @Override
    public Quizz clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        Quizz q=(Quizz)super.clone();
        q.questions=new ArrayList<>();
        for(Question question : questions) {
            q.questions.add((Question)question.clone());
        }
        return q;
    }

}
