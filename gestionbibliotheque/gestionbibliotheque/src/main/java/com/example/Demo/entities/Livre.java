package com.example.Demo.entities;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;

import java.util.Date;

@Entity
@AllArgsConstructor @NoArgsConstructor @Data 
public class Livre {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
    @Column(length = 50, nullable = false) 
    private String titre;
    
    @Column(nullable = false, updatable = false) 
    private String maisonEdition;
    
    @Temporal(TemporalType.DATE) @Column(nullable = false)
    private Date dateSortie;
    
    @Column(nullable = false) 
    private String auteur;
    
    @Column(nullable = false) 
    private String nombrePage;
    
    @Column(unique = true, updatable = false, nullable = false)
    private String isbn;
    
    @Temporal(TemporalType.TIMESTAMP) @CreationTimestamp @Column(nullable = false)
    private Date dateDerniereConsultation;
    
    @Column(nullable = false)
    private Boolean disponible;
}
