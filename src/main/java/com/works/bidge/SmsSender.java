package com.works.bidge;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("sms")
public class SmsSender implements INotificationSender{

    @Override
    public void sendMessage(String message) {
        System.out.println("SMS sent: " + message + "");
    }

}
