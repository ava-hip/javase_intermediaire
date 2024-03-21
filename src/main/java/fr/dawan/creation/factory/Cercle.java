package fr.dawan.creation.factory;

public class Cercle implements Forme{
    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double calculSurface() {
        return Math.PI*rayon*rayon;
    }
}
