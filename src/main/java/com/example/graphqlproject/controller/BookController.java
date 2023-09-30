package com.example.graphqlproject.controller;

import com.example.graphqlproject.Entity.Book;
import com.example.graphqlproject.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {


    @Autowired
    private BookService bookService;

    @PostMapping
    //create
    public Book create(@RequestBody Book book){
        return this.bookService.create(book);
    }


    @GetMapping
    //get all
    public List<Book> getAll(){
        return this.bookService.getAll();
    }

    @GetMapping("/{bookId}")
    //get single
    public Book getBookById(@PathVariable int bookId){
        return this.bookService.get(bookId);
    }
}
