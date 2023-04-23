package pl.sda.micgeb.springrestapp.beans;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class SingletonBean {

    private final Integer randomInteger;

    public SingletonBean() {
        Random random = new Random();
        this.randomInteger = random.nextInt();
    }

    public Integer showInt() {
        return randomInteger;
    }
}
