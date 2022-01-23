package com.example.CarsOrder.model.Entitiec;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;

@Entity
@Table
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String review_details;
    private String review_Date;


    @OneToOne
    @JoinColumn(name = "BookingID",unique = true,updatable = false)
    private Booking booking;

    public Review() {
    }

    public Review(int id, String review_details, String review_Date, Booking booking) {
        this.id = id;
        this.review_details = review_details;
        this.review_Date = review_Date;
        this.booking = booking;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReview_details() {
        return review_details;
    }

    public void setReview_details(String review_details) {
        this.review_details = review_details;
    }

    public String getReview_Date() {
        return review_Date;
    }

    public void setReview_Date(String review_Date) {
        this.review_Date = review_Date;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }
}
