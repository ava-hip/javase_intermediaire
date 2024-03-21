package fr.dawan.creation.builder;

abstract public class PizzaBuilder {
    protected Pizza pizza;

    public Pizza getPizza() {
        return pizza;
    }

    public void createPizza() {
        pizza = new Pizza();
    }

    public abstract PizzaBuilder buildPate();
    public abstract PizzaBuilder buildBase();
    public abstract PizzaBuilder buildGarniture();
}
