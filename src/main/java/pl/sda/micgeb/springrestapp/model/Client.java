package pl.sda.micgeb.springrestapp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.validator.constraints.pl.PESEL;

import javax.validation.constraints.AssertTrue;

@AllArgsConstructor
@Data
@Builder
@RequiredArgsConstructor
public class Client {
    private String firstName;
    private String lastName;
    private String email;
    @PESEL
    private String pesel;
    @AssertTrue
    private boolean isPremium;
}
