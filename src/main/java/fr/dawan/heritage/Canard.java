package fr.dawan.heritage;

public class Canard extends Animal {
    public Canard(String nom) {
        super(nom);
    }

    @Override
    public void manger() {
        System.out.println("Le canard mange des miettes de pains");
    }

    @Override
    public void crier() {
        System.out.println("Coin coin !");
    }

    public void nager() {
        System.out.println("Le canard nage");
    }
}
