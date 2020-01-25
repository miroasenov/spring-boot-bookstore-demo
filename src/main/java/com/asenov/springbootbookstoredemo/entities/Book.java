package com.asenov.springbootbookstoredemo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

    private double price;

    @Column(name="front_cover")
    private String frontCover;
}