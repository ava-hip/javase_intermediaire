package fr.dawan.creation.prototype;

public class Reponse implements Cloneable {
    private String text;
    private boolean correct;

    public Reponse(String text, boolean correct) {
        this.text = text;
        this.correct = correct;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Reponse [text=").append(text).append(", correct=").append(correct).append("]");
        return builder.toString();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
