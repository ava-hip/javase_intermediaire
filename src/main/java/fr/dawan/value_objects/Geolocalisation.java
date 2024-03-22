package fr.dawan.value_objects;

import java.util.Objects;

// Value Object
// - pas d'identité unique , uniquement du contenu
// - objet immuable (ne peut pas être modifier après sa création)
// - un value object peut apartenir à une ou plusieurs entités (il n'est pas autonme)
// - pour reconnaitre un value object on peut essayer de le remplacer par un entier
// - Les values object n'ont pas leur propre table en BDD
// - préférez des value objet au lieu d'une entité pour un modèle métier
public class Geolocalisation implements Comparable<Geolocalisation>{


    private  final double longitude;

    private final double latitude;

    // constructeur uniquiment initialisation
    public Geolocalisation(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getLocation() {
        return String.format("{0},{1}", longitude,latitude);
    }

    @Override
    public int hashCode() {
        return Objects.hash(latitude, longitude);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Geolocalisation other = (Geolocalisation) obj;
        return Double.doubleToLongBits(latitude) == Double.doubleToLongBits(other.latitude)
                && Double.doubleToLongBits(longitude) == Double.doubleToLongBits(other.longitude);
    }

    @Override
    public int compareTo(Geolocalisation o) {
        // Comparaison basé sur la distance
        return 0;
    }
}
