package fr.dawan.creation.abstractfactory;

public class HtmlTextBox implements TextBox{
    @Override
    public void afficher() {
        System.out.println("Textbox HTML");
    }
}
