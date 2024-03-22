package fr.dawan.telldontask.atelier;

import java.util.Map;

public class Portefeuille {
    private final Map<String, Integer> actions;

    private double solde;

    public Portefeuille(Map<String, Integer> actions, double solde) {
        this.actions = actions;
        this.solde = solde;
    }

    public int getNombreAction(Action action) {
        return actions.get(action.getNom());
    }

    public void ajouterAction(Action action, int nombre, double frais) {
        double montant = action.calculPrix(nombre, frais);
        if (montant > solde) {
            throw new RuntimeException("Pas assez d'argent");
        } else {
            solde -= montant;
            actions.merge(action.getNom(), nombre, Integer::sum);
        }

    }

    public void supprimerAction(Action action, int nombre, double frais) {
        double montant = action.calculPrix(nombre, -frais);
        if (montant < 0 && Math.abs(montant) > solde) {
            throw new RuntimeException("Pas assez d'argent");
        } else if (nombre > getNombreAction(action)) {
            throw new RuntimeException("Pas assez d'argent");
        } else {
            solde += montant;
            actions.put(action.getNom(), getNombreAction(action) - nombre);
        }
    }

    public double getSolde() {
        return solde;
    }

}
