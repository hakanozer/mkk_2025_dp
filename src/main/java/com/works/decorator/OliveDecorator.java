package com.works.decorator;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OliveDecorator extends PizzaDecorator {
    public OliveDecorator(@Qualifier("plainPizza") Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", olives";
    }

    @Override
    public double cost() {
        return decoratedPizza.cost() + 0.75; // Cost of olive topping
    }

    @Override
    public String getKey() {
        return "olive";
    }
}
