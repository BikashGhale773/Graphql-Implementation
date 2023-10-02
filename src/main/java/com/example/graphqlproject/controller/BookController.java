package com.example.graphqlproject.controller;

import com.example.graphqlproject.Entity.Book;
import com.example.graphqlproject.Service.BookService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
//@RequestMapping("/books")

@Controller
public class BookController {
    @Autowired
    private BookService bookService;

//    @PostMapping
    //create
    //@RequestBody to pass data now it is converted into @Arguments
    @MutationMapping("createBook")
    public Book create(@Argument BookInput book){
        Book b5 = new Book();
        b5.setPages(book.getPages());
        b5.setPrice(book.getPrice());
        b5.setAuthor(book.getAuthor());
        b5.setDesc(book.getDesc());
        b5.setTitle(book.getTitle());
        return this.bookService.create(b5);
    }


//    @GetMapping
    //get all
    @QueryMapping("allBooks")
    public List<Book> getBooks(){
        return this.bookService.getAll();
    }

//    @GetMapping("/{bookId}")
    //get single
    //@PathVariable to get dynamic id now it is converted into @Arguments

    @QueryMapping("singleBook")
    public Book getBookById(@Argument int bookId){
       return this.bookService.get(bookId);
    }
}

@Getter
@Setter
class BookInput{
    private String title;
    private String desc;
    private String author;
    private double price;
    private int pages;

}
