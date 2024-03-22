package fr.dawan.ocp.good;

public class Rectangle implements Forme {
    private double largeur;
    private double longueur;

    public Rectangle(double largeur, double longueur) {
        this.largeur = largeur;
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public double getLongueur() {
        return longueur;
    }

    @Override
    public double calculSurface() {
        return longueur*largeur;
    }
}
