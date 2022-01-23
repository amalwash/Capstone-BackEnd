package com.example.CarsOrder.model.Repository;

import com.example.CarsOrder.model.Entitiec.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ReviewRepository extends JpaRepository<Review, Integer> {
}
