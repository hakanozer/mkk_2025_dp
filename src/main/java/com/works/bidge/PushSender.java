package com.works.bidge;

import org.springframework.stereotype.Component;

@Component("push")
public class PushSender implements INotificationSender{
    @Override
    public void sendMessage(String message) {
        System.out.println("Push sent: " + message + "");
    }
}
