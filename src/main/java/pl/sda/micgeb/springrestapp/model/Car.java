package pl.sda.micgeb.springrestapp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@AllArgsConstructor
@Data
@Builder
@RequiredArgsConstructor
public class Car {
    @NotNull(message = "Model nie moze byc nullem")
    private String model;

    @Size(min = 2, max = 10)
    private String brand;

    @Min(2000)
    @Max(2023)
    private int productionYear;

    @Range(min=500, max = 1_000_000)
    private BigDecimal value;

    @Length(max=10)
    private String fuelType;

}
