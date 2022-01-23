package com.example.CarsOrder.model.Service;

import com.example.CarsOrder.model.Entitiec.*;
import com.example.CarsOrder.model.Repository.UserRepositry;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;

class UserServiceTest {
    @Mock
    UserRepositry userRepositry;
    @InjectMocks
    UserService userService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetUser() {
        List<User> result = userService.getUser();
        Assertions.assertEquals(Arrays.<User>asList(new User("userName", "password", "firstname", "user_address", 0, 0, "user_email", "roles", Arrays.<Booking>asList(new Booking(0, new Car(0, "car_model", "car_color", "car_type", "car_description", "img", new Owner(0, "owner_firstName", "owner_lastName", "owner_address", 0, 0, "owner_email", Arrays.<Car>asList(null)), null), new Review(0, "review_details", "review_Date", null), null)))), result);
    }

    @Test
    void testAddNewUser() {
        Integer result = userService.addNewUser(new User("userName", null, null, null, 0, 0, null, null, null));
        Assertions.assertEquals(Integer.valueOf(1), result);
    }

    @Test
    void testCheckLogin() {
        when(userRepositry.findRoles(anyString())).thenReturn("findRolesResponse");
        when(userRepositry.findPassword(anyString())).thenReturn("findPasswordResponse");

        String result = userService.checkLogin("userName", "password");
        Assertions.assertEquals("please sign up", result);
    }

    @Test
    void testDeleteUser() {
        userService.deleteUser("userName");
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme