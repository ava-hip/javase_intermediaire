package fr.dawan.creation.abstractfactory.factory;

import fr.dawan.creation.abstractfactory.Bouton;
import fr.dawan.creation.abstractfactory.TextBox;
import fr.dawan.creation.abstractfactory.WindowsBouton;
import fr.dawan.creation.abstractfactory.WindowsTextBox;
import fr.dawan.creation.abstractfactory.factory.UIFactory;

public class WindowsFactory implements UIFactory {
    @Override
    public Bouton createBouton() {
        return new WindowsBouton();
    }

    @Override
    public TextBox createTextBox() {
        return new WindowsTextBox();
    }
}
