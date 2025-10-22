package com.works.bidge;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.management.timer.TimerNotification;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class NotificationService extends Notification {

    private final Map<String, INotificationSender> iNotificationSenderMap;
    //final @Qualifier("email") INotificationSender emailSender;

    @Override
    public void send(String message, String type) {
        System.out.println(iNotificationSenderMap);
        iNotificationSenderMap.get(type).sendMessage(message);
    }
}
