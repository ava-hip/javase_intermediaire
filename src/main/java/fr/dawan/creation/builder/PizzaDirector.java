package fr.dawan.creation.builder;

public class PizzaDirector {
    private PizzaBuilder pizzaBuilder;

    public PizzaBuilder getPizzaBuilder() {
        return pizzaBuilder;
    }

    public void setPizzaBuilder(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public Pizza getPizza() {
        return pizzaBuilder.getPizza();
    }

    public void cookPizza() {
        pizzaBuilder.createPizza();
        pizzaBuilder.buildPate().buildBase().buildGarniture();
    }

    // Définir d'autre process de création
}
