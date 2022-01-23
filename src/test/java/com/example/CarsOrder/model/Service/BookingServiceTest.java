package com.example.CarsOrder.model.Service;

import com.example.CarsOrder.model.Entitiec.*;
import com.example.CarsOrder.model.Repository.BookingRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.*;

class BookingServiceTest {
    @Mock
    BookingRepository bookingRepository;
    @InjectMocks
    BookingService bookingService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetBookings() {
        List<Booking> result = bookingService.getBookings();
        Assertions.assertEquals(Arrays.<Booking>asList(new Booking(0, new Car(0, "car_model", "car_color", "car_type", "car_description", "img", new Owner(0, "owner_firstName", "owner_lastName", "owner_address", 0, 0, "owner_email", Arrays.<Car>asList(null)), null), new Review(0, "review_details", "review_Date", null), new User("userName", "password", "firstname", "user_address", 0, 0, "user_email", "roles", Arrays.<Booking>asList(null)))), result);
    }

    @Test
    void testGetBooking() {
        Optional<Booking> result = bookingService.getBooking(Integer.valueOf(0));
        Assertions.assertEquals(null, result);
    }

    @Test
    void testAddNewBooking() {
        bookingService.addNewBooking(new Booking(0, new Car(0, "car_model", "car_color", "car_type", "car_description", "img", new Owner(0, "owner_firstName", "owner_lastName", "owner_address", 0, 0, "owner_email", Arrays.<Car>asList(null)), null), new Review(0, "review_details", "review_Date", null), new User("userName", "password", "firstname", "user_address", 0, 0, "user_email", "roles", Arrays.<Booking>asList(null))));
    }

    @Test
    void testDeleteBooking() {
        bookingService.deleteBooking(Integer.valueOf(0));
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme