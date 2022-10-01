package com.example.SpringDataJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {

		ApplicationContext context= SpringApplication.run(SpringDataJpaApplication.class, args);
		CocheRepository repository=context.getBean(CocheRepository.class);

		//Crear y guardar un coche
		Coche toyota=new Coche(null, 2004, "Toyota", "HX5");
		repository.save(toyota);

		//Contar objetos en la BD:
		System.out.println("Numero de coches en BD: "+repository.count());

		//Recuperar todos los valores de la BD:
		System.out.println(repository.findAll());


	}

}
