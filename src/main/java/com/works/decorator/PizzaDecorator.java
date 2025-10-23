package com.works.decorator;

public abstract class PizzaDecorator implements Pizza {
    protected final Pizza decoratedPizza;

    public PizzaDecorator(Pizza decoratedPizza) {
        this.decoratedPizza = decoratedPizza;
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription();
    }

    @Override
    public double cost() {
        return decoratedPizza.cost();
    }

    public abstract String getKey();
}