package fr.dawan.dependances.association;

public class Pirate {
    private int id;
    private String nom;

    public Pirate(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Pirate " + id + " | nom: " + nom;
    }
}
