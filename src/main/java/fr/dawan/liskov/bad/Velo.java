package fr.dawan.liskov.bad;

public class Velo extends Transport{

    // Un vélo n'a pas de moteur on ne peut donc pas implémenter cette méthode
    @Override
    public void demarrer() {
        super.demarrer();
    }

    // Le principe de liskov n'est pas respecté
    // Un obkjet d'un sous-type de transport peut remplacer un objet de transport

}
