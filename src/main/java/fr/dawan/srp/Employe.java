package fr.dawan.srp;

import java.time.LocalDate;

public class Employe {
    private long id;
    private String nom;
    private String prenom;
    private String adresse;
    private LocalDate dateArrivee;

    /*
     * Ne respecte pas le single responsability principe
     * -> Ces 2 méthodes ne sont pas de la responsabilité de l'employe

    public boolean promotionAnciennete() {
        // Traitement promotion
        return false;
    }

    public double calculImpotAnnee() {
        // Calcul impot
        return 0;
    }

    public void save() {  }

     */
}
