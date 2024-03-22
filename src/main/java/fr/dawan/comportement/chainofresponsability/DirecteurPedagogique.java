package fr.dawan.comportement.chainofresponsability;

public class DirecteurPedagogique extends Staff{
    public DirecteurPedagogique(String nom, Staff successeur) {
        super(nom, successeur);
    }

    @Override
    public void handleRequete(Requete requete) {
        if (requete.getType() == RequeteType.DIRECTEUR_PEDAGOGIQUE) {
            System.out.println("Votre requête a été traité par le directeur pédagogique");
            requete.setState(RequeteState.CLOSED);
        } else if (successeur != null) {
            System.out.println("Le directeur pédagogique a remonté votre requête");
            successeur.handleRequete(requete);
        }
    }
}
