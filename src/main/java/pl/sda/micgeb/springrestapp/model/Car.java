package pl.sda.micgeb.springrestapp.model;

import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@Getter
@Setter
@Data
@Builder
@RequiredArgsConstructor
public class Car {
    private String model;
    private String brand;
    private String productionYear;
    private BigDecimal value;
    private String fuelType;

}
