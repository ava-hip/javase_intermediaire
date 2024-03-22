package fr.dawan.dependances.association;

public class App {
    public static void main(String[] args) {
        Pirate luffy = new Pirate(1, "Monkey D. Luffy");
        Pirate zoro = new Pirate(2, "Roronoa Zoro");
        Pirate chopper = new Pirate(3, "Chopper");
        Departement mugiwara = new Departement("Mugiwara");

        mugiwara.addPirate(luffy);
        mugiwara.addPirate(zoro);
        mugiwara.addPirate(chopper);

        System.out.println(mugiwara);
    }
}
