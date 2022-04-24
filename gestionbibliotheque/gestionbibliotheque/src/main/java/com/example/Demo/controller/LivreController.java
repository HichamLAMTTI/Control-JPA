package com.example.Demo.controller;

import com.example.Demo.entities.Livre;
import com.example.Demo.service.LivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    
    
}
