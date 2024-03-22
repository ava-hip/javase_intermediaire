package fr.dawan.comportement.observer;

public class App {
    public static void main(String[] args) {
        Produit produit = new Produit("One piece", 1750);

        Client luffy = new Client("Monkey D. Luffy");
        Client shanks = new Client("Shanks le Roux");

        produit.attach(luffy);
        produit.attach(shanks);
        produit.modifier(19.0);
        produit.detach(shanks);
        produit.modifier(50);
    }
}
