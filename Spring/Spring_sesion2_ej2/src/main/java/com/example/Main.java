package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Probando
public class Main {

    public static void main(String[] args) {

        ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");

        NotificationService notificationService = (NotificationService) context.getBean("notificationService");

        UserService userService = (UserService) context.getBean("userService");

        System.out.println(userService.notificationService.Saludar());
    }
}
