package com.example.CarsOrder.controller;
import com.example.CarsOrder.model.Entitiec.Booking;
import com.example.CarsOrder.model.Service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;



@RestController
@RequestMapping
public class BookingController {

    private BookingService bookingService;

    @Autowired
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }


    @GetMapping(path = "/Booking")
    public List<Booking> getBookings() {
        return bookingService.getBookings();
    }

    @GetMapping(path = "Booking/{bookingId}")
    public Optional<Booking> getBooking(@PathVariable(name = "bookingId") Integer bookingId) {
        return bookingService.getBooking(bookingId);
    }

    @PostMapping("add")
    public void registerNewBooking(@RequestBody Booking booking){
        bookingService.addNewBooking(booking);
    }


    @DeleteMapping(path = "delete/{bookingId}")
    public void deleteBooking(@PathVariable ("bookingId") Integer bookingId){
        bookingService.deleteBooking(bookingId);
    }

}
