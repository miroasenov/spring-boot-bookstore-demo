package com.asenov.springbootbookstoredemo.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import lombok.Data;

@Entity
@Table(name="genres")
@Data
public class Genre {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToMany(cascade=CascadeType.ALL, mappedBy="genre")//refers to the property genre of the Book class
    private List<Book> books;
    
}