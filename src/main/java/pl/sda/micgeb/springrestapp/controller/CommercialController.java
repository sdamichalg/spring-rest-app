package pl.sda.micgeb.springrestapp.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.micgeb.springrestapp.service.CommercialService;

@RestController
@RequestMapping("/commercial")
public class CommercialController {

    private final CommercialService commercialService;

    public CommercialController(@Qualifier("smsCommercialService") CommercialService commercialService) {
        this.commercialService = commercialService;
    }

    @PostMapping
    public ResponseEntity<Void> sendCommercial(@RequestBody String commercialContent) {
        commercialService.sendCommercial(commercialContent);
        return ResponseEntity.ok().build();
    }
}
