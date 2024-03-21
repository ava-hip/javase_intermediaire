package fr.dawan.creation.builder;

public class App {
    public static void main(String[] args) {
        PizzaDirector director = new PizzaDirector();

        PizzaNapolitaineBuilder builder = new PizzaNapolitaineBuilder();
        director.setPizzaBuilder(builder);
        director.cookPizza();
        Pizza pizza = director.getPizza();
        System.out.println(pizza);

    }
}
