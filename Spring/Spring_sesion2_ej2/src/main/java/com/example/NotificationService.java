package com.example;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    String name;

    public NotificationService() {
        name="";
        System.out.println("Ejecutando constructor por defecto");
    }

    public NotificationService(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String Saludar(){

        return "Hola !";
    }


}
