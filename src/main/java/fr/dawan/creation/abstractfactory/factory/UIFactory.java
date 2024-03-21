package fr.dawan.creation.abstractfactory.factory;

import fr.dawan.creation.abstractfactory.Bouton;
import fr.dawan.creation.abstractfactory.TextBox;

public interface UIFactory {
    Bouton createBouton();
    TextBox createTextBox();
}
