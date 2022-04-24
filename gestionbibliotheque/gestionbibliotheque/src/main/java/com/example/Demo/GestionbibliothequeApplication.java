package com.example.Demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Demo.entities.Livre;
import com.example.Demo.service.LivreService;

@SpringBootApplication
public class GestionbibliothequeApplication implements CommandLineRunner {
	@Autowired
	private LivreService livreService;
	public static void main(String[] args) {
		SpringApplication.run(GestionbibliothequeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
