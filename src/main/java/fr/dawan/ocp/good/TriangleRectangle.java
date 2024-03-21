package fr.dawan.ocp.good;

public class TriangleRectangle extends Rectangle {
    public TriangleRectangle(double largeur, double longueur) {
        super(largeur, longueur);
    }

    @Override
    public double calculSurface(Forme forme) {
        return super.calculSurface(forme)/2;
    }
}
