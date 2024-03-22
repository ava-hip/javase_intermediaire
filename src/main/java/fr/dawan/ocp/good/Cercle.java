package fr.dawan.ocp.good;

public class Cercle implements Forme {
    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    public double getRayon() {
        return rayon;
    }

    @Override
    public double calculSurface() {
        return Math.PI*rayon*rayon;
    }
}
