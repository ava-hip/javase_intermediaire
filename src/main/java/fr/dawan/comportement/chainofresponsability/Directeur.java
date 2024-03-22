package fr.dawan.comportement.chainofresponsability;

public class Directeur extends Staff{
    public Directeur(String nom, Staff successeur) {
        super(nom, successeur);
    }

    @Override
    public void handleRequete(Requete requete) {
        System.out.println("Votre requête a été traité par le directeur");
        requete.setState(RequeteState.CLOSED);
    }
}
