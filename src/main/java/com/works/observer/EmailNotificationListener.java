package com.works.observer;

import lombok.RequiredArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EmailNotificationListener {


    @EventListener
    public void emailSend(OrderCreatedEvent event){
        System.out.println("Email Send : " + event.getOrder().getOid());
    }

}
