package fr.dawan.creation.builder;

public class PizzaNapolitaineBuilder extends PizzaBuilder {

    @Override
    public PizzaBuilder buildPate() {
        pizza.setPate("Fine");
        return this;
    }

    @Override
    public PizzaBuilder buildBase() {
        pizza.setBase("Tomate");
        return this;
    }

    @Override
    public PizzaBuilder buildGarniture() {
        pizza.setGarniture("Fromage");
        return this;
    }
}
