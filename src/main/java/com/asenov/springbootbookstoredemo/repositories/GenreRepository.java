package com.asenov.springbootbookstoredemo.repositories;

import com.asenov.springbootbookstoredemo.entities.Genre;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre,Integer> {

    
}