package fr.dawan.encapsulation;

public class App {
    public static void main(String[] args) {
        Eleve e = new Eleve("Luffy", "Monkey D.");
        e.setNote(16);
        e.setNote(18);
        e.setNote(15);
        e.setNote(13);

        System.out.println(e.getPrenom() + " " + e.getNom() + " avec une moyenne de " + e.moyenne(e.getNotes()));
    }
}
