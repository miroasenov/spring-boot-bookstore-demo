package com.asenov.springbootbookstoredemo.controllers;

import java.util.List;

import com.asenov.springbootbookstoredemo.entities.Book;
import com.asenov.springbootbookstoredemo.repositories.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class BookController {

    @Autowired
    private BookRepository bookRepo;

    @GetMapping("/")
    public String showAllBooks(Model model){
        
        List<Book> books = bookRepo.findAll();
        model.addAttribute("books", books);
        return "books";
    } 

    @GetMapping("/cover/{id}")
    public String showFrontCover(@PathVariable int id, Model model) {

        Book book = bookRepo.getOne(id);

        model.addAttribute("book", book);

        return "cover";
    }
    
    @GetMapping("/genre/{id}")
    public String showBooksByGenre(Model model, @PathVariable int id){

        List<Book> books = bookRepo.findByGenreId(id);

        model.addAttribute("books", books);

        return "genre";
    }
}