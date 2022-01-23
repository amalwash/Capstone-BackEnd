package com.example.CarsOrder.model.Service;
import com.example.CarsOrder.model.Entitiec.Car;
import com.example.CarsOrder.model.Repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {
    private CarRepository carRepository;

    @Autowired
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }
    public List<Car> getCars(){
        return carRepository.findAll();

    }
    public Optional<Car> getCar(Integer carId){
        return carRepository.findById(carId);

    }
    public void addNewCar(Car car){
        carRepository.save(car);
    }
    public void deleteCar(Integer carId){
        carRepository.deleteById(carId);
    }
}

