package fr.dawan.structure.composite;

import java.util.List;

public class Consultant extends Employe{
    public Consultant(String nom) {
        super(nom);

    }

    @Override
    public void afficher() {
        System.out.println(getNom());
    }
}
