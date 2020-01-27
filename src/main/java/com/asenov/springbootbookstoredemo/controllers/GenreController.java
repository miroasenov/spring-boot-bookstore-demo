package com.asenov.springbootbookstoredemo.controllers;

import java.util.List;

import com.asenov.springbootbookstoredemo.entities.Genre;
import com.asenov.springbootbookstoredemo.repositories.GenreRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GenreController {

    @Autowired
    private GenreRepository genreRepo;

    @GetMapping("/genres")
    public String showGenres(Model model){

        List<Genre> genres = genreRepo.findAll();
        model.addAttribute("genres", genres);
        return "showGenres";
    }
}