package com.works.observer;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OrderPublisher {

    final private ApplicationEventPublisher publisher;

    public void publishOrderCreated(Order order) {
        System.out.println("OrderPublisher: Sipariş olayı yayınlanıyor...");
        publisher.publishEvent(new OrderCreatedEvent(this, order));
    }

}
