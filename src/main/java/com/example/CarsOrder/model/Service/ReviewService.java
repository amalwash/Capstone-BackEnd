package com.example.CarsOrder.model.Service;


import com.example.CarsOrder.model.Entitiec.Review;
import com.example.CarsOrder.model.Repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewService {
    private ReviewRepository reviewRepository;
    @Autowired
    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }
    public List<Review> getReviews() {
        return reviewRepository.findAll();
    }
    public Optional<Review> getReview(Integer reviewId){
        return reviewRepository.findById(reviewId);
    }
    public void addNewReview(Review review) {
        reviewRepository.save(review);

    }
    public void deleteReview(Integer reviewId){
        reviewRepository.deleteById(reviewId);
    }
}
