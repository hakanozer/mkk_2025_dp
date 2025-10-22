package com.works.bidge;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("email")
public class EmailSender implements INotificationSender{

    @Override
    public void sendMessage(String message) {
        System.out.println( "Email sent: " + message );
    }

}
