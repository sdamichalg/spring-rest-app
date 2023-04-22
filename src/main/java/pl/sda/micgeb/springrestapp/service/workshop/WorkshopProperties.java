package pl.sda.micgeb.springrestapp.service.workshop;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "workshop.info")
@Slf4j
@Setter
@Getter
public class WorkshopProperties {

    private String author;
    private String name;

    public void printDataFromProperties() {
        log.info("From WorkshopProperties - Author: " + author + " name: " + name);
    }
}
