package pl.sda.micgeb.springrestapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import pl.sda.micgeb.springrestapp.exceptions.ExistingCarException;
import pl.sda.micgeb.springrestapp.exceptions.NoSuchFuelTypeException;

@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(ExistingCarException.class)
    public ResponseEntity<String> handleExistingCarException(ExistingCarException e) {
        return ResponseEntity.status(HttpStatus.CONFLICT).body(e.getMessage());
    }

    @ExceptionHandler(NoSuchFuelTypeException.class)
    public ResponseEntity<String> handleNoFuelTypeException(NoSuchFuelTypeException e) {
        return ResponseEntity.status(HttpStatus.CONFLICT).body(e.getMessage());
    }
}
