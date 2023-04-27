package pl.sda.micgeb.springrestapp.exceptions;

public class NoSuchFuelTypeException extends RuntimeException {
    public NoSuchFuelTypeException(String fuelType) {
        super(String.format("Samochód o typie paliwa [%s] nie istnieje", fuelType));
    }
}