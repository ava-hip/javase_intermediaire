package fr.dawan.telldontask.atelier;

import java.util.Map;

public class Courtier {
    private static final double FRAIS_REDUIT = 0.05;
    private static final double FRAIS_NORMAL = 0.15;

    private final Map<String, Portefeuille> portefeuilles;

    public Courtier(Map<String, Portefeuille> portefeuilles) {
        this.portefeuilles = portefeuilles;
    }

    public void acheterAction(String numeroClient, Action action, int nombre) {
        Portefeuille portefeuille = portefeuilles.get(numeroClient);
        double frais = calculFrais(nombre);
        portefeuille.ajouterAction(action, nombre, frais);
    }

    public void vendreAction(String numeroClient, Action action, int nombre) {
        Portefeuille portefeuille = portefeuilles.get(numeroClient);
        double frais = calculFrais(nombre);
        portefeuille.supprimerAction(action, nombre, frais);
    }

    private double calculFrais(double nombre) {
        return nombre < 100 ? FRAIS_NORMAL * nombre : FRAIS_REDUIT * nombre;
    }

}
