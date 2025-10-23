package com.works.decorator;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MushroomDecorator extends PizzaDecorator {
    public MushroomDecorator(@Qualifier("plainPizza") Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", mushrooms";
    }

    @Override
    public double cost() {
        return decoratedPizza.cost() + 1.0; // Cost of mushroom topping
    }

    @Override
    public String getKey() {
        return "mushroom";
    }
}
