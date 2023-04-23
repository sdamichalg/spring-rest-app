package pl.sda.micgeb.springrestapp.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import pl.sda.micgeb.springrestapp.model.Car;
import pl.sda.micgeb.springrestapp.repository.CarRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

//@Service
@RequiredArgsConstructor
@Slf4j
public class CarService {

    private final CarRepository carRepository;

    public List<Car> getAllCars() {
        return carRepository.getAllCars();
    }

    public Car getCarByRegistrationNumber(String registrationNumber) {
        Optional<Car> carByRegistrationNumber = carRepository.getCarByRegistrationNumber(registrationNumber);
        return carByRegistrationNumber.orElse(null);
    }

    public List<Car> getCarsByFuelType(String fuelType) {
        List<Car> carsByFuelType = carRepository.getCarsByFuelType(fuelType);
        return carsByFuelType;
    }

    public Car updateCarWithNewValue(String registrationNumber, BigDecimal newValue) {
        Optional<Car> carByRegistrationNumber = carRepository.getCarByRegistrationNumber(registrationNumber);
        if (carByRegistrationNumber.isPresent()) {
            Car car = carByRegistrationNumber.get(); //Optional -> Car

            return car;
        } else {
            log.info("Nie znaleziono samochodu o takiej rejestracji: " + registrationNumber);
            return null;
        }
    }

    public List<Car> addNewCar(String registrationNumber, Car newCar) {
        return carRepository.addNewCar(registrationNumber, newCar);
    }

}
