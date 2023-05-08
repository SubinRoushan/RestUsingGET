package com.rest.api.book.requestingrestapi.controller;

import com.rest.api.book.requestingrestapi.entities.Book;
import com.rest.api.book.requestingrestapi.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ControllerBook {
    @Autowired
    private BookService bookService;
    @GetMapping("/book")

    //For All Book
    public List<Book> getbook()
    {
        return this.bookService.getAllBook();
    }

    //For Single Book

    @GetMapping("/book/{id}")
    public Book getbookbyeid(@PathVariable("id") int id)
    {
        return this.bookService.getBookById(id);
    }


}
