package fr.dawan.comportement.chainofresponsability;

public class Professeur extends Staff{

    public Professeur(String nom, Staff successeur) {
        super(nom, successeur);
    }

    @Override
    public void handleRequete(Requete requete) {
        if (requete.getType() == RequeteType.PROFESSEUR) {
            System.out.println("Votre requête a été traité par le professeur");
            requete.setState(RequeteState.CLOSED);
        } else if (successeur != null) {
            System.out.println("Le prof a remonté votre requête");
            successeur.handleRequete(requete);
        }
    }
}
