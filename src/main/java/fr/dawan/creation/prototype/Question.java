package fr.dawan.creation.prototype;

import java.util.ArrayList;
import java.util.List;

public class Question implements Cloneable {
    private String text;
    private List<Reponse> reponses = new ArrayList<>();

    public Question(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Reponse> getReponses() {
        return reponses;
    }

    public void addReponses(Reponse reponse) {
        reponses.add(reponse);
    }

    @Override
    public String toString() {
        return "Question{" +
                "text='" + text + '\'' +
                ", reponses=" + reponses +
                '}';
    }

    @Override
    public  Object clone() throws CloneNotSupportedException {
        Question q=(Question)super.clone();
        q.reponses=reponses.stream().map(r -> {
            try {
                return (Reponse)r.clone();
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }).toList();
        return q;
    }

}
