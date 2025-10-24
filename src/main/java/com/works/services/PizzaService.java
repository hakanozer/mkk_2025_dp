package com.works.services;

import com.works.decorator.*;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class PizzaService {

    //private List<PizzaDecorator> pizzaDecorators;
    private final Map<String, PizzaDecorator> pizzaDecoratorMap;
    private final ApplicationContext applicationContext;
    private @Qualifier("plainPizza") Pizza pizza;

    public void orderPizza(List<String> types){
        System.out.println(pizzaDecoratorMap);


        for (String type : types) {
            PizzaDecorator pizzaDecorator = pizzaDecoratorMap.get(type);
            pizza = applicationContext.getBean(pizzaDecorator.getClass(), pizza);
        }

        System.out.println(pizza.cost() + " " + pizza.getDescription());
    }

}
