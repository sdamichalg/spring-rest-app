package pl.sda.micgeb.springrestapp.beans;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/beans/v2")
@RequiredArgsConstructor
public class BeansControllerV2 {

    private final PrototypeBean prototypeBean; //ta sama wartosc w v2, inna wartosc w v1
    private final SingletonBean singletonBean; //ta sama wartosc
    private final RequestBean requestBean; //inna wartosc za kazdym wywolaniem

    @GetMapping("/singleton")
    public ResponseEntity<Integer> showSingleton() {
        return ResponseEntity.ok(singletonBean.showInt());
    }

    @GetMapping("/prototype")
    public ResponseEntity<Integer> showPrototype() {
        return ResponseEntity.ok(prototypeBean.showInt());
    }

    @GetMapping("/request")
    public ResponseEntity<Integer> showRequest() {
        return ResponseEntity.ok(requestBean.showInt());
    }
}
