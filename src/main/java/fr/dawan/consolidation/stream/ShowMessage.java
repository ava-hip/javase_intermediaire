package fr.dawan.consolidation.stream;

public class ShowMessage {
    public void afficherMessage() {
        System.out.println("Référence de méthode d'instance");
    }

    @Override
    public String toString() {
        return "ShowMessage{}";
    }
}