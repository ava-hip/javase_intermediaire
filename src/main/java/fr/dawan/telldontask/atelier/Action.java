package fr.dawan.telldontask.atelier;

public class Action {
    private final String nom;
    private final double prixActuel;

    public Action(String nom, double prixActuel) {
        this.nom = nom;
        this.prixActuel = prixActuel;
    }

    public String getNom() {
        return nom;
    }

    public double getPrixActuel() {
        return prixActuel;
    }

    public double calculPrix(int nombre, double frais) {
        return prixActuel * nombre + frais;
    }

}
