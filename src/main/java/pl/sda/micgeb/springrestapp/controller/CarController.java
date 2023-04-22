package pl.sda.micgeb.springrestapp.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
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
            return ResponseEntity.notFound().build();
        }

    }
}
