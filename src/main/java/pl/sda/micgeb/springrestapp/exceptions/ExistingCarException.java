package pl.sda.micgeb.springrestapp.exceptions;

public class ExistingCarException extends RuntimeException {
    public ExistingCarException(String registrationNumber) {
        super(String.format("Samochód o rejestracji [%s] już istnieje", registrationNumber));
    }
}