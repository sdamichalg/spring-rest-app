package pl.sda.micgeb.springrestapp.service.workshop;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Greetings {
    @Value("${my.greetings}")
    private String greetings;

    public void showGreetings(){
        log.info(greetings);
    }

}
