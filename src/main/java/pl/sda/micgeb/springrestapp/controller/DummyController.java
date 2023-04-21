package pl.sda.micgeb.springrestapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dummy")
public class DummyController {

    @GetMapping
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("Hello from GET method");
    }

    @PostMapping("/post/v1")
    public ResponseEntity<String> post() {
        return ResponseEntity.ok("Hello from POST method");
    }

    @PutMapping
    public ResponseEntity<String> put() {
        return ResponseEntity.ok("Hello from PUT method");
    }

    @DeleteMapping
    public ResponseEntity<String> delete() {
        return ResponseEntity.ok("Hello from DELETE method");
    }
}
