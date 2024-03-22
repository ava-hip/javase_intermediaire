package fr.dawan.encapsulation;

public class Rectangle {
    private long largeur;
    private long hauteur;

    public Rectangle(long largeur, long hauteur) {
        setLargeur(largeur);
        setHauteur(hauteur);
    }

    private void setLargeur(long largeur) {
        if(largeur <= 0) {
            throw new IllegalArgumentException("La largeur ne peut être négative");
        }
        this.largeur = largeur;
    }

    private void setHauteur(long hauteur) {
        if(hauteur <= 0) {
            throw new IllegalArgumentException("La hauteur ne peut être négative");
        }
        this.hauteur = hauteur;
    }

    public long getSurface() {
        return largeur*hauteur;
    }

    public void redim(long largeur, long hauteur) {
        setLargeur(largeur);
        setHauteur(hauteur);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "largeur=" + largeur +
                ", hauteur=" + hauteur +
                '}';
    }
}
