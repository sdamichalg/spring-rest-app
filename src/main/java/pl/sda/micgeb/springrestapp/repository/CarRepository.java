package pl.sda.micgeb.springrestapp.repository;

import pl.sda.micgeb.springrestapp.model.Car;

import java.util.List;
import java.util.Optional;

public interface CarRepository {
    List<Car> getAllCars();
    Optional<Car> getCarByRegistrationNumber(String registrationNumber);

    List<Car> getCarsByFuelType(String fuelType);
}
