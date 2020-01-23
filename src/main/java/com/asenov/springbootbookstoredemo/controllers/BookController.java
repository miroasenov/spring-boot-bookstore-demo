package com.asenov.springbootbookstoredemo.controllers;

import java.util.List;

import com.asenov.springbootbookstoredemo.entities.Book;
import com.asenov.springbootbookstoredemo.repositories.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {

    @Autowired
    private BookRepository bookRepo;

    @GetMapping("/")
    public String readAll(Model model){
        
        List<Book> books = bookRepo.findAll();
        model.addAttribute("books", books);
        return "read";
    }  
}