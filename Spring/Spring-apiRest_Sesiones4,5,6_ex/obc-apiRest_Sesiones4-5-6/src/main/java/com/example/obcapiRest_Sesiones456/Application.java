package com.example.obcapiRest_Sesiones456;

import com.example.obcapiRest_Sesiones456.Entities.Computer;
import com.example.obcapiRest_Sesiones456.Repositories.ComputerRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.time.LocalDate;

@SpringBootApplication
@ComponentScan({"com.example.obcapiRest_Sesiones456"})  //Broken down into different modules
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);

		ComputerRepository comrepo = context.getBean(ComputerRepository.class);

		//CRUD

		//Crear un ordenador
		Computer computer1 = new Computer(null, "OneVivo13","Packard Bell",799.15, "light blue", LocalDate.of(2021,12,7), true );
		Computer computer2 = new Computer(null, "ZenBook","Asus",876.59, "Black", LocalDate.of(2019,6,12), false);

		//Almacenarlos

		comrepo.save(computer1);
		comrepo.save(computer2);

		//Los recuperamos

		comrepo.findAll().size();

		//Borrar uno de los ordenadores

		//comrepo.deleteById(3L);

	}

}
