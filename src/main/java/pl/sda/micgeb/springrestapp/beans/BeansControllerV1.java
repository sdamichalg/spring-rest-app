package pl.sda.micgeb.springrestapp.beans;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/beans/v1")
@RequiredArgsConstructor
public class BeansControllerV1 {

    private final PrototypeBean prototypeBean;
    private final SingletonBean singletonBean;
    private final RequestBean requestBean;

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
