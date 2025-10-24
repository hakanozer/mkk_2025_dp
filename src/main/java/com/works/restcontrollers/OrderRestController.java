package com.works.restcontrollers;

import com.works.observer.Order;
import com.works.services.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderRestController {

    final private OrderService orderService;

    @GetMapping("order")
    public void order(@RequestBody Order order) {
        orderService.publish(order);
    }


}
