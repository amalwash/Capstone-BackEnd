package com.example.CarsOrder.model.Repository;
import com.example.CarsOrder.model.Entitiec.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {

}
