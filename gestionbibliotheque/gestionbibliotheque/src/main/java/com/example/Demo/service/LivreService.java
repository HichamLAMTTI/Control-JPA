package com.example.Demo.service;

import com.example.Demo.entities.Livre;
import com.example.Demo.repos.LivreRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.OrderBy;
import java.util.List;

@Service
public class LivreService {

    @Autowired
    private LivreRepos livreRepos;

    
    public List<Livre> getAllBooks(){
      return livreRepos.findAllByOrderByTitreAsc();
    };

    public Livre getBookById(Long id){
        return livreRepos.findById(id).get();
    };

    public void saveBook(Livre l){
        livreRepos.save(l);
    }

    public void updateBook(Livre l){
        livreRepos.save(l);
    }

    public void deleteBookById(Long id){
        livreRepos.deleteById(id);
    }
}
