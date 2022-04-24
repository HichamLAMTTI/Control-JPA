package com.example.Demo;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

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
		/*
		livreService.saveBook(
				new Livre(null, "Titre A", "Maison D'Edition 1", new Date(), "Auteur 1", "320" , "123456",
						new Date(), true));
		
		livreService.saveBook(
				new Livre(null, "Titre B", "Maison D'Edition 2", new Date(), "Auteur 2", "300" , "654321",
						new Date(), true));
		
		livreService.saveBook(
				new Livre(null, "Titre C", "Maison D'Edition 3", new Date(), "Auteur 3", "1240" , "456789",
						new Date(), false));
		
		livreService.saveBook(
				new Livre(null, "Titre D", "Maison D'Edition 4", new Date(), "Auteur 4", "480" , "987456",
						new Date(), true));
		
		livreService.saveBook(
				new Livre(null, "Titre E", "Maison D'Edition 5", new Date(), "Auteur 5", "124" , "987654",
						new Date(), true));
		*/
	}

}
