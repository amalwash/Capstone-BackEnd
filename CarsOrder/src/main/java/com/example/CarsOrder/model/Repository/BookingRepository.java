package com.example.CarsOrder.model.Repository;

import com.example.CarsOrder.model.Entitiec.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository  extends JpaRepository<Booking, Integer> {
}
