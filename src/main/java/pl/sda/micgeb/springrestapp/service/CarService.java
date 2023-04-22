package pl.sda.micgeb.springrestapp.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.sda.micgeb.springrestapp.model.Car;
import pl.sda.micgeb.springrestapp.repository.CarRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRepository carRepository;

    public List<Car> getAllCars() {
        return carRepository.getAllCars();
    }
}
