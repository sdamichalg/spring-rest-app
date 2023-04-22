package pl.sda.micgeb.springrestapp.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.sda.micgeb.springrestapp.model.Car;
import pl.sda.micgeb.springrestapp.service.CarService;

import java.util.List;

@RestController
@RequestMapping("/car")
@RequiredArgsConstructor
public class CarController {

    private final CarService carService;

    @GetMapping("/all")
    public ResponseEntity<List<Car>> getAllCars() {
        List<Car> allCars = carService.getAllCars();
        return ResponseEntity.ok(allCars);
    }
    @GetMapping
    public ResponseEntity<Car> getCarByRegistrationNumber(@RequestParam String registrationNumber) {
        Car carByRegistrationNumber = carService.getCarByRegistrationNumber(registrationNumber);
        if (carByRegistrationNumber != null) {
            return ResponseEntity.ok(carByRegistrationNumber);
        } else {
            return ResponseEntity.noContent().build();
        }
    }

    @GetMapping("/fuel/{fuelType}")
    public ResponseEntity<List<Car>> getCarsByFuelType(@PathVariable String fuelType) {
        List<Car> carsByFuelType = carService.getCarsByFuelType(fuelType);
        return ResponseEntity.ok(carsByFuelType);
    }
}
