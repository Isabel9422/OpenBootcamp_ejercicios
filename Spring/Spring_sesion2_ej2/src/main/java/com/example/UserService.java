package com.example;

import org.springframework.stereotype.Component;

@Component
public class UserService {

    NotificationService notificationService;
    String name;

    public UserService(NotificationService notificationService, String name) {
        this.notificationService = notificationService;
        this.name = name;
    }

    public UserService() {
        notificationService= new NotificationService();
        name = "";
    }

    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public NotificationService getNotificationService() {
        return notificationService;
    }


}
