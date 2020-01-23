package com.asenov.springbootbookstoredemo.repositories;

import com.asenov.springbootbookstoredemo.entities.Book;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer>{

    
}