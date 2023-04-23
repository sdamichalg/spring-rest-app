package pl.sda.micgeb.springrestapp.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
@Scope("prototype")
public class PrototypeBean {

    private final Integer randomInteger;

    public PrototypeBean() {
        Random random = new Random();
        this.randomInteger = random.nextInt();
    }

    public Integer showInt() {
        return randomInteger;
    }
}
