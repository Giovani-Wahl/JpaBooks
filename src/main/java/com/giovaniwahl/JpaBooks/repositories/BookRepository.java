package com.giovaniwahl.JpaBooks.repositories;

import com.giovaniwahl.JpaBooks.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
