package fr.dawan.comportement.observer;

import java.util.ArrayList;
import java.util.List;

public class Produit implements Subject<Double>{
    private String description;
    private double prix;
    private List<Observer<Double>> observers = new ArrayList<>();

    public Produit(String description, double prix) {
        this.description = description;
        this.prix = prix;
    }

    @Override
    public void attach(Observer<Double> observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer<Double> observer) {
        observers.remove(observer);
    }

    @Override
    public void notify(Double prix) {
        observers.forEach(o -> o.update(prix));
    }

    public void modifier(double prix) {
        this.prix = prix;
        notify(prix);
    }
}
