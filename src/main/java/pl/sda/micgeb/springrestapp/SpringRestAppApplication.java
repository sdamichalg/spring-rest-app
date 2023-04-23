package pl.sda.micgeb.springrestapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class SpringRestAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringRestAppApplication.class, args);
    }

}
