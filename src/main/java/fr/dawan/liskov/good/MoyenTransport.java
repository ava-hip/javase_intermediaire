package fr.dawan.liskov.good;

public abstract class MoyenTransport {
    private String nom;
    private double vitesse;

    public abstract void déplacer();
}
