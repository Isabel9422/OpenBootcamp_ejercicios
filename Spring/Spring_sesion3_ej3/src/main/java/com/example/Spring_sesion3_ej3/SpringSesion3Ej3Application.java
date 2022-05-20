package com.example.Spring_sesion3_ej3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringSesion3Ej3Application {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(SpringSesion3Ej3Application.class, args);

		PerroRepository repository = context.getBean(PerroRepository.class);

		Perro perro = new Perro("Max", 7, "Border collie", null);

		repository.save(perro);

		System.out.println(repository.findAll());
	}

}
