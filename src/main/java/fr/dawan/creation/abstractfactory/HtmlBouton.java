package fr.dawan.creation.abstractfactory;

public class HtmlBouton implements Bouton{
    @Override
    public void afficher() {
        System.out.println("Bouton HTML");
    }
}
