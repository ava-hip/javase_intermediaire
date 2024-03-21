package fr.dawan.structure.facade;

public class App {
    public static void main(String[] args) {
        LecteurAudioFacade lecteur = new LecteurAudioFacade();
        lecteur.jouer("Narrow Head - Ashtray");
    }
}
