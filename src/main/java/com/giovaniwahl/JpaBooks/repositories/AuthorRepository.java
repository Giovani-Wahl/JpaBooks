package com.giovaniwahl.JpaBooks.repositories;

import com.giovaniwahl.JpaBooks.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Long> {
}
