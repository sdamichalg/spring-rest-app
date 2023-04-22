package pl.sda.micgeb.springrestapp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Builder
@AllArgsConstructor
@Getter
@Setter
public class Car {
    private String model;
    private String brand;
    private String productionYear;
    private BigDecimal value;
    private String fuelType;

}
