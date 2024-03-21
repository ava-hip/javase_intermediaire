package fr.dawan.creation.factory;

public class Carre implements Forme {

    private double largeur;

    public Carre(double largeur) {
        this.largeur = largeur;
    }

    @Override
    public double calculSurface() {
        return 2*largeur;
    }
}
