package codemika.com.demo.controller;

import codemika.com.demo.Service;
import codemika.com.demo.annotation.SimpleHelloAnnotation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Controller {
private final Service service;
    @GetMapping("c")
    @SimpleHelloAnnotation
    public ResponseEntity<?> text() {
        Service.text("Hello, world");
        return ResponseEntity.ok("");
    }
}
