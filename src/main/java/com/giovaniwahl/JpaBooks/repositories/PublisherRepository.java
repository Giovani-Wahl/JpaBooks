package com.giovaniwahl.JpaBooks.repositories;

import com.giovaniwahl.JpaBooks.entities.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher,Long> {
}
