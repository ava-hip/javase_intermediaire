package fr.dawan.creation.prototype;

public class App {
    public static void main(String[] args) {
        Quizz quizz = new Quizz("Quizz design pattern");
        Question question = new Question("A l'origine, quel est le nombre de design pattern");
        question.getReponses().add(new Reponse("45", false));
        question.getReponses().add(new Reponse("12", false));
        question.getReponses().add(new Reponse("23", true));
        question.getReponses().add(new Reponse("8", true));
        quizz.addQuestions(question);
        System.out.println(quizz);

        try {
            Quizz quizzclone = (Quizz)quizz.clone();
            quizzclone.getQuestions().get(0).getReponses().get(0).setText("2");
            System.out.println(quizz);
            System.out.println(quizzclone);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
