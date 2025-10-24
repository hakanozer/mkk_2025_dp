package com.works.observer;

import lombok.RequiredArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SmsNotificationListener {

    @EventListener
    public void smsSend(OrderCreatedEvent event){
        System.out.println("Sms Send : " + event.getOrder().getOid());
    }
}
