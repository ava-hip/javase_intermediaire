package fr.dawan.structure.composite;

public abstract class Employe {
    private String nom;

    public Employe(String nom) {
        this.nom = nom;
    }

    public abstract void afficher();

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
