package com.example.CarsOrder.controller;
import com.example.CarsOrder.model.Entitiec.Review;
import com.example.CarsOrder.model.Service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping

public class ReviewController {

    private ReviewService reviewService;

    @Autowired
   public ReviewController(ReviewService reviewService) {
       this.reviewService = reviewService;
    }

   @GetMapping
    public List<Review> getReviews() {
       return reviewService.getReviews();
    }

    @GetMapping(path = "Reviews/{reviewId}")
    public Optional<Review> getReview(@PathVariable(name = "reviewId") Integer reviewId) {
        return reviewService.getReview(reviewId);
    }

   @PostMapping("review/add")
    public void registerNewReview(@RequestBody Review review) {
       System.out.println("inside add review");
        reviewService.addNewReview(review);
    }

    @DeleteMapping(path = "api/delete/{id}")
    public void deleteReview(@PathVariable("reviewId") String reviewId) {
        int intreviewId= Integer.parseInt(reviewId);
       reviewService.deleteReview(intreviewId);
   }
}
