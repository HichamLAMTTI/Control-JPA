package com.example.Demo.controller;

import com.example.Demo.entities.Livre;
import com.example.Demo.service.LivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping(path = "/myapp")
public class LivreController {

    @Autowired
    private LivreService livreService;

    
    @GetMapping("/books")
    public List<Livre> findAllBooks(){
        return livreService.getAllBooks();
    }

    
    @GetMapping("/books/{id}")
    public Livre findBookById(@PathVariable Long id){
        return livreService.getBookById(id);
    }
    
    @PostMapping("/books/addBook")
    public String addBook(@RequestBody Livre bookToAdd){
        livreService.saveBook(bookToAdd);
        
        return "Book Added Successfully !!";
    }
    
    
    @PutMapping("/books/{id}")
    public String updateBook(@PathVariable Long id, @RequestBody Livre bookDetails) {
    	Livre book = livreService.getBookById(id);
    	book.setTitre(bookDetails.getTitre());
    	book.setMaisonEdition(bookDetails.getMaisonEdition());
    	book.setAuteur(bookDetails.getAuteur());
    	book.setNombrePage(bookDetails.getNombrePage());
    	book.setIsbn(bookDetails.getIsbn());
    	book.setDateDerniereConsultation(bookDetails.getDateDerniereConsultation());
    	book.setDisponible(bookDetails.getDisponible());
    	
    	livreService.saveBook(book);
    	
    	return "Book updated successfully !!";
    }
    
    
    @DeleteMapping("/books/{id}")
    public String removeBook(@PathVariable Long id) {
    	livreService.deleteBookById(id);
    	return "Book deleted successfully!!";
    }
    
}
