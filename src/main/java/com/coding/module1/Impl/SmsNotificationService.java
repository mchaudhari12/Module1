package com.coding.module1.Impl;

import com.coding.module1.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
@Component
//@Qualifier
//@ConditionalOnProperty(name = "notification.type" ,havingValue = "SMS")
public class SmsNotificationService implements NotificationService {

    @Override
    public void send(String message) {
        System.out.println("SMS Notification Send..."+message);
    }
}
