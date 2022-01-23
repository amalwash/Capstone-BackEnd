package com.example.CarsOrder.model.Service;

import com.example.CarsOrder.model.Entitiec.*;
import com.example.CarsOrder.model.Repository.OwnerRepository;
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

class OwnerServiceTest {
    @Mock
    OwnerRepository ownerRepository;
    @InjectMocks
    OwnerService ownerService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetOwners() {
        List<Owner> result = ownerService.getOwners();
        Assertions.assertEquals(Arrays.<Owner>asList(new Owner(0, "owner_firstName", "owner_lastName", "owner_address", 0, 0, "owner_email", Arrays.<Car>asList(new Car(0, "car_model", "car_color", "car_type", "car_description", "img", null, new Booking(0, null, new Review(0, "review_details", "review_Date", null), new User("userName", "password", "firstname", "user_address", 0, 0, "user_email", "roles", Arrays.<Booking>asList(null))))))), result);
    }

    @Test
    void testGetOwner() {
        Optional<Owner> result = ownerService.getOwner(Integer.valueOf(0));
        Assertions.assertEquals(null, result);
    }

    @Test
    void testAddNewOwner() {
        ownerService.addNewOwner(new Owner(0, "owner_firstName", "owner_lastName", "owner_address", 0, 0, "owner_email", Arrays.<Car>asList(new Car(0, "car_model", "car_color", "car_type", "car_description", "img", null, new Booking(0, null, new Review(0, "review_details", "review_Date", null), new User("userName", "password", "firstname", "user_address", 0, 0, "user_email", "roles", Arrays.<Booking>asList(null)))))));
    }

    @Test
    void testDeleteOwner() {
        ownerService.deleteOwner(Integer.valueOf(0));
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme