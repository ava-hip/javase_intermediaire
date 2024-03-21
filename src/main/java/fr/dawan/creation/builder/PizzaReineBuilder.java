package fr.dawan.creation.builder;

public class PizzaReineBuilder extends PizzaBuilder {

    @Override
    public PizzaBuilder buildPate() {
        pizza.setPate("Moyenne");
        return this;
    }

    @Override
    public PizzaBuilder buildBase() {
        pizza.setBase("Tomate");
        return this;
    }

    @Override
    public PizzaBuilder buildGarniture() {
        pizza.setGarniture("Jambon, Champignon, Fromage");
        return this;
    }
}
