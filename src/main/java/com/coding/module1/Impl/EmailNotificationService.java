package com.coding.module1.Impl;

import com.coding.module1.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
//@Qualifier
//@ConditionalOnProperty(name = "notification.type" ,havingValue = "email")
public class EmailNotificationService implements NotificationService {

    @Override
    public void send(String message) {
        System.out.println("Email Notification Send..."+message);
    }
}
