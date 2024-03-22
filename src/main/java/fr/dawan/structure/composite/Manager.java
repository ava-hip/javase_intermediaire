package fr.dawan.structure.composite;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employe{
    private List<Employe> employes = new ArrayList<>();

    public Manager(String nom) {
        super(nom);
    }

    @Override
    public void afficher() {
        System.out.println(getNom());
        System.out.println("________________");
        employes.forEach(e -> e.afficher());
    }

    public boolean ajoutEmploye(Employe employe) {
        return employes.add(employe);
    }

    public boolean retirerEmploye(Employe employe) {
        return employes.remove(employe);
    }

    public Employe getChild(int index) {
        return null;
    }
}
