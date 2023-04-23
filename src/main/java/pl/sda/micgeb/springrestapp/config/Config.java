package pl.sda.micgeb.springrestapp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.sda.micgeb.springrestapp.controller.WorkshopController;
import pl.sda.micgeb.springrestapp.repository.CarRepository;
import pl.sda.micgeb.springrestapp.repository.InMemoryCarRepository;
import pl.sda.micgeb.springrestapp.service.CarService;
import pl.sda.micgeb.springrestapp.service.workshop.WorkshopInfo;
import pl.sda.micgeb.springrestapp.service.workshop.WorkshopProperties;

@Configuration
public class Config {

    @Autowired
    WorkshopProperties workshopProperties;
    @Bean
    public WorkshopInfo workshopInfo() {
        return new WorkshopInfo();
    }
    @Bean
    public WorkshopController workshopController() {
        return new WorkshopController(workshopInfo(), workshopProperties);
    }

    @Bean
    public CarRepository carRepository() {
        return new InMemoryCarRepository();
    }

    @Bean
    public CarService carService() {
        return new CarService(carRepository());
    }

}
