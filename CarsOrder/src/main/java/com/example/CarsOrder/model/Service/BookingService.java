package com.example.CarsOrder.model.Service;
import com.example.CarsOrder.model.Entitiec.Booking;
import com.example.CarsOrder.model.Repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class BookingService {
    private BookingRepository bookingRepository;

        public BookingService(BookingRepository bookingRepository) {
            this.bookingRepository = bookingRepository;
        }

        @Autowired

        public List<Booking> getBookings() {
            return bookingRepository.findAll();

        }

        public Optional<Booking> getBooking(Integer BookingId) {
            return bookingRepository.findById(BookingId);

        }

        public void addNewBooking(Booking booking) {
            bookingRepository.save(booking);
        }

        public void deleteBooking(Integer BookingId) {
            bookingRepository.deleteById(BookingId);

        }
}
