package com.works.restcontrollers;

import com.works.services.PizzaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PizzaRestController {

    final PizzaService pizzaService;

    @GetMapping("pizza")
    public void pizza(@RequestBody List<String> types){
        pizzaService.orderPizza(types);
    }
}
