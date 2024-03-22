package fr.dawan.comportement.chainofresponsability;

public abstract class Staff {
    protected String nom;
    protected Staff successeur;

    public Staff(String nom, Staff successeur) {
        this.nom = nom;
        this.successeur = successeur;
    }

    public abstract void handleRequete(Requete requete);
}
