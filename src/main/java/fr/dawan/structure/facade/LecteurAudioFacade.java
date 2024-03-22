package fr.dawan.structure.facade;

public class LecteurAudioFacade {
    private ChargeurFichier chargeurFichier;
    private DecodeurAudio decodeurAudio;
    private AmplificateurSon amplificateurSon;

    public LecteurAudioFacade() {
        this.chargeurFichier = new ChargeurFichier();
        this.decodeurAudio = new DecodeurAudio();
        this.amplificateurSon = new AmplificateurSon();
    }

    public void jouer(String fichier) {
        chargeurFichier.chargerFichier(fichier);
        decodeurAudio.decoder(fichier);
        amplificateurSon.amplifier(fichier);
    }
}
