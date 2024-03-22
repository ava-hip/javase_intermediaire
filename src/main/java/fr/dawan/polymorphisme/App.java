package fr.dawan.polymorphisme;

public class App {
    public static void main(String[] args) {
        Magasin.acheter(new Chaise());
        Magasin.acheterGenerique(new Chaise());


    }
}
