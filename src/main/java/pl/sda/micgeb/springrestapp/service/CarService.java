package pl.sda.micgeb.springrestapp.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.sda.micgeb.springrestapp.model.Car;
import pl.sda.micgeb.springrestapp.repository.CarRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRepository carRepository;

    public List<Car> getAllCars() {
        return carRepository.getAllCars();
    }

    public Car getCarByRegistrationNumber(String registartionNumber) {
        Optional<Car> carByRegistrationNumber = carRepository.getCarByRegistrationNumber(registartionNumber);
        return carByRegistrationNumber.orElse(null);
    }

    public List<Car> getCarsByFuelType(String fuelType) {
        List<Car> carsByFuelType = carRepository.getCarsByFuelType(fuelType);
        return carsByFuelType;
    }
}
