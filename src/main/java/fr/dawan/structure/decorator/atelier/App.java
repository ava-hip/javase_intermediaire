package fr.dawan.structure.decorator.atelier;

public class App {
    public static void main(String[] args) {
        Costume c1 = new Chapeau(new BaseCostume());
        System.out.println(c1);
        Costume c2 = new Lunette(new BaseCostume());
        System.out.println(c2);
    }
}
