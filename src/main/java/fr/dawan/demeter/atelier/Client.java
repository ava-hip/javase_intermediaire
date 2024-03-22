package fr.dawan.demeter.atelier;

public class Client {
    private String nom;
    private Portefeuille portefeuille;

    public Client(String nom) {
        this.nom = nom;
    }

    public double paiement(double montant) {
        return portefeuille.debit(montant);
    }
}
