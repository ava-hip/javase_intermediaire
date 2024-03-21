package fr.dawan.creation.abstractfactory;

import fr.dawan.creation.abstractfactory.factory.HtmlFactory;
import fr.dawan.creation.abstractfactory.factory.UIFactory;
import fr.dawan.creation.abstractfactory.factory.WindowsFactory;

public class App {
    private Bouton bouton;
    private TextBox textBox;

    public App(UIFactory factory) {
        bouton = factory.createBouton();
        textBox = factory.createTextBox();
    }

    public void afficher() {
        bouton.afficher();
        textBox.afficher();
    }

    public static void main(String[] args) {
        UIFactory factory;
        String os = System.getProperty("os.name");
        if("Windows 11".equals(os)) {
            factory = new WindowsFactory();
        } else {
            factory = new HtmlFactory();
        }
        App app = new App(factory);
        app.afficher();
    }
}
