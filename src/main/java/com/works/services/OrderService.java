package com.works.services;

import com.works.observer.Order;
import com.works.observer.OrderPublisher;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

    final private OrderPublisher publisher;

    public void publish(Order order){
        publisher.publishOrderCreated(order);
    }


}
