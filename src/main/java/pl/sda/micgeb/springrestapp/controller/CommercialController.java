package pl.sda.micgeb.springrestapp.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.micgeb.springrestapp.service.CommercialService;

@RestController
@RequestMapping("/commercial")
@RequiredArgsConstructor
public class CommercialController {

    private final CommercialService commercialService;

    @PostMapping
    public ResponseEntity<Void> sendCommercial(@RequestBody String commercialContent) {
        commercialService.sendCommercial(commercialContent);
        return ResponseEntity.ok().build();
    }
}
