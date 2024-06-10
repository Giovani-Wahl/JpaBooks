package com.giovaniwahl.JpaBooks.repositories;

import com.giovaniwahl.JpaBooks.entities.Publisher;
import com.giovaniwahl.JpaBooks.entities.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review,Long> {
}
