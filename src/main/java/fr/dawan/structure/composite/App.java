package fr.dawan.structure.composite;

public class App {
    public static void main(String[] args) {
        Manager manager = new Manager("Monkey D. Luffy");

        Consultant shanks = new Consultant("Shanks Le Roux");
        Consultant ace = new Consultant("Portgas D. Ace");
        Consultant barbeBlanche = new Consultant("Barbe Blanche");

        manager.ajoutEmploye(shanks);
        manager.ajoutEmploye(ace);
        manager.ajoutEmploye(barbeBlanche);
        manager.afficher();

    }
}
