package fr.dawan.creation.abstractfactory.factory;

import fr.dawan.creation.abstractfactory.*;

public class HtmlFactory implements UIFactory {
    @Override
    public Bouton createBouton() {
        return new HtmlBouton();
    }

    @Override
    public TextBox createTextBox() {
        return new HtmlTextBox();
    }
}
