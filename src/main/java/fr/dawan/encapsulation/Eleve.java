package fr.dawan.encapsulation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Eleve {
    private String prenom;
    private String nom;
    private List<Integer> notes = new ArrayList<>();

    public Eleve(String nom, String prenom) {
        setNom(nom);
        setPrenom(prenom);
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        if (prenom==null || prenom.length() < 3) {
            throw new IllegalArgumentException("Prenom incorrect");
        }
        this.prenom = prenom;
    }

    public void setNom(String nom) {
        if (nom==null || nom.length() < 3) {
            throw new IllegalArgumentException("Nom incorrect");
        }
        this.nom = nom;
    }

    public List<Integer> getNotes() {
        return notes;
    }


    public double moyenne(List<Integer> notes) {
        return notes.stream().collect(Collectors.averagingDouble(n -> n));
    }

    public void setNote(Integer note) {
        if(note < 0 || note > 20) {
            throw new IllegalArgumentException("La note doit être comprise entre  0 et 20");
        }
        notes.add(note);
    }

}
