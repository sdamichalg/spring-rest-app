package pl.sda.micgeb.springrestapp.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
@Service
@Slf4j
public class SmsCommercialService implements CommercialService{
    @Override
    public void sendCommercial(String commercialContent) {
        log.info(String.format("Sent sms from SmsCommercialService: [%s]", commercialContent));
    }
}
