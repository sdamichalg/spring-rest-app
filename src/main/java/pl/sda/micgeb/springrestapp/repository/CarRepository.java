package pl.sda.micgeb.springrestapp.repository;

import pl.sda.micgeb.springrestapp.model.Car;

import java.util.List;

public interface CarRepository {
    List<Car> getAllCars();
}
