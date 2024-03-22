package fr.dawan.demeter.atelier;

public class Portefeuille {
    private double solde;

    public Portefeuille(double solde) {
        this.solde = solde;
    }

    public double debit(double montant) {
        if(montant > solde) {
            throw new IllegalArgumentException("Solde inssufisant");
        }
        return solde += montant;
    }
}
