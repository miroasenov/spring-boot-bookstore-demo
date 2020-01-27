package com.asenov.springbootbookstoredemo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="books")
@Data
public class Book {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id; 

    private String title;

    private String author;

    @Column(name="front_cover")
    private String frontCover;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "genre_id")
    private Genre genre;

    private double price;  
}