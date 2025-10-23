package com.works.decorator;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CheeseDecorator extends PizzaDecorator {
    public CheeseDecorator(@Qualifier("plainPizza") Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", cheese";
    }

    @Override
    public double cost() {
        return decoratedPizza.cost() + 1.5; // Cost of cheese topping
    }

    @Override
    public String getKey() {
        return "cheese";
    }
}
