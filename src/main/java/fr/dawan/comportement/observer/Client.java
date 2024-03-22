package fr.dawan.comportement.observer;

public class Client implements Observer<Double>{
   private String nom;
   private double lastPrice;

    public String getNom() {
        return nom;
    }

    public double getLastPrice() {
        return lastPrice;
    }

    public Client(String nom) {
        this.nom = nom;
    }

    @Override
    public void update(Double prix) {
        System.out.println("changement de prix: "+ lastPrice + " -> " + prix + " pour " + nom);
        lastPrice = prix;
    }
}
