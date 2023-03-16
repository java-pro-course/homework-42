package svarog.edu.annotation.api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import svarog.edu.annotation.annotation.SimpleHelloAnnotation;

@RestController
@RequiredArgsConstructor
public class MainController {

    @SimpleHelloAnnotation
    @GetMapping("I-love-Codemika")
    public ResponseEntity<?> iLoveCodemika(){
        return ResponseEntity.ok("OK");
    }
}