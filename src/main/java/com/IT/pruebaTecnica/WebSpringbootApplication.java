package com.IT.pruebaTecnica;

import com.IT.pruebaTecnica.service.PersonaEstiloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebSpringbootApplication {

	@Autowired
	private PersonaEstiloService personaEstiloService;

	public static void main(String[] args) {
		SpringApplication.run(WebSpringbootApplication.class, args);
	}
}
