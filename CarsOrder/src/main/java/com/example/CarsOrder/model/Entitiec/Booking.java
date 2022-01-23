package com.example.CarsOrder.model.Entitiec;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;

@Entity
@Table
@JsonIdentityInfo(
       generator = ObjectIdGenerators.PropertyGenerator.class,
       property = "id")

public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JoinColumn(name = "Car_ID",unique = true,updatable = false)
    private Car car;

    @OneToOne(mappedBy = "booking")
    private Review review;


    @ManyToOne
    @JoinColumn(name = "USERName",referencedColumnName = "userName")
    private User user;

    public Booking() {
    }

    public Booking(int id, Car car, Review review, User user) {
        this.id = id;
        this.car = car;
        this.review = review;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
