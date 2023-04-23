package pl.sda.micgeb.springrestapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import pl.sda.micgeb.springrestapp.service.workshop.Greetings;

@SpringBootApplication
@EnableWebMvc
public class SpringRestAppApplication implements CommandLineRunner {

    @Autowired
    Greetings greetings;

    public static void main(String[] args) {
        SpringApplication.run(SpringRestAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        greetings.showGreetings();
    }
}
