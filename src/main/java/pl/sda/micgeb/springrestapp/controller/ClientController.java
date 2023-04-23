package pl.sda.micgeb.springrestapp.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.micgeb.springrestapp.model.Client;

import javax.validation.Valid;

@RestController
@RequestMapping("/client")
@Slf4j
public class ClientController {

    @PostMapping
    public ResponseEntity<Void> addClient(@RequestBody @Valid Client newClient) {
        log.info(newClient.toString());

        return ResponseEntity.ok().build();
    }
}
