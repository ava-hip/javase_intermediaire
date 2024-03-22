package fr.dawan.dependances.composition;

public class Appartement {
    private Cuisine cuisine;

    public Appartement() {
        super();
        this.cuisine = new Cuisine();
    }

}
