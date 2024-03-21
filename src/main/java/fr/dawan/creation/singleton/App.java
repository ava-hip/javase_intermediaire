package fr.dawan.creation.singleton;

public class App {
    public static void main(String[] args) {
        Pdg p1 = Pdg.getInstance();

        Pdg p2 = Pdg.getInstance();

        System.out.println(p1);
        System.out.println(p2);
    }
}
