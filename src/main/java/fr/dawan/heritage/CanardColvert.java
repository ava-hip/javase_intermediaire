package fr.dawan.heritage;

public class CanardColvert extends Canard {
    public CanardColvert(String nom) {
        super(nom);
    }

    @Override
    public void nager() {
        System.out.println(" colvert nage");
    }
}
