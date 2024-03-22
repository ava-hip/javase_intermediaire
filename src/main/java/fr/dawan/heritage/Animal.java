package fr.dawan.heritage;

abstract class Animal {
    private String nom;

    public Animal(String nom) {
        this.nom = nom;
    }

    public abstract void manger();
    public abstract void crier();
}
