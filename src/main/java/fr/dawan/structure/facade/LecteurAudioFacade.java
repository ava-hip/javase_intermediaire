package fr.dawan.structure.facade;

public class LecteurAudioFacade {
    private ChargeurFichier chargeurFichier;
    private DecodeurAudio decodeurAudio;
    private AmplificateurSon amplificateurSon;

    public void jouer(String fichier) {
        chargeurFichier.chargerFichier(fichier);
        decodeurAudio.decoder(fichier);
        amplificateurSon.amplifierSon(fichier);
    }
}
