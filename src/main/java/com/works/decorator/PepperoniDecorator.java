package com.works.decorator;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PepperoniDecorator extends PizzaDecorator {
    public PepperoniDecorator(@Qualifier("plainPizza") Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", pepperoni";
    }

    @Override
    public double cost() {
        return decoratedPizza.cost() + 2.0; // Cost of pepperoni topping
    }

    @Override
    public String getKey() {
        return "pepper";
    }
}
