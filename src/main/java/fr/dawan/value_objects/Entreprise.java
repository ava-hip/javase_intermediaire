package fr.dawan.value_objects;

import java.util.Objects;

public class Entreprise {
    private int id;

    private String nom;

    private Geolocalisation localisation;

    public Entreprise(int id, String nom, Geolocalisation localisation) {
        this.id = id;
        this.nom = nom;
        this.localisation = localisation;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Entreprise other = (Entreprise) obj;
        return id == other.id;
    }

    public int compareByLocation(Entreprise e1) {
        return localisation.compareTo(e1.localisation);
    }

    public int compareByName(Entreprise e1) {
        return nom.compareTo(e1.nom);
    }
}
