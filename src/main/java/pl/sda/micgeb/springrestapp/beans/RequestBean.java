package pl.sda.micgeb.springrestapp.beans;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import java.util.Random;

@Component
@RequestScope
public class RequestBean {

    private final Integer randomInteger;

    public RequestBean() {
        Random random = new Random();
        this.randomInteger = random.nextInt();
    }

    public Integer showInt() {
        return randomInteger;
    }
}
