package com.example.graphqlproject.Repository;

import com.example.graphqlproject.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Integer> {
}
