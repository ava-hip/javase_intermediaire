package fr.dawan.creation.abstractfactory;

public class WindowsBouton implements Bouton {

    @Override
    public void afficher() {
        System.out.println("Bouton windows");
    }
}
