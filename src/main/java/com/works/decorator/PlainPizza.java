package com.works.decorator;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("plainPizza")
public class PlainPizza implements Pizza {

    @Override
    public String getDescription() {
        return "Plain pizza";
    }

    @Override
    public double cost() {
        return 8.0; // Base price of the pizza
    }
}
