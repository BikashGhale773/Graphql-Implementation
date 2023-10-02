package com.example.graphqlproject;

import com.example.graphqlproject.Entity.Book;
import com.example.graphqlproject.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphqlProjectApplication implements CommandLineRunner {

	@Autowired
	private BookService bookService;

	public static void main(String[] args) {
		SpringApplication.run(GraphqlProjectApplication.class, args);



	}

	@Override
	public void run(String... args) throws Exception {
		Book b1 = new Book();
		b1.setAuthor("Bikash");
		b1.setDesc("Graphql");
		b1.setTitle("Graphql iplementation");
		b1.setPrice(300);
		b1.setPages(25);

		Book b2 = new Book();
		b2.setAuthor("Kamala");
		b2.setDesc("Java");
		b2.setTitle("Java iplementation");
		b2.setPrice(200);
		b2.setPages(20);

		Book b3 = new Book();
		b3.setAuthor("Kusum");
		b3.setDesc("Springboot");
		b3.setTitle("Springboot iplementation");
		b3.setPrice(100);
		b3.setPages(13);

		this.bookService.create(b1);
		this.bookService.create(b2);
		this.bookService.create(b3);
	}
}
