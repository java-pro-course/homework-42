package codemika.com.demo.controller;

import codemika.com.demo.Service;
import codemika.com.demo.annotation.InfoAnnotation;
import codemika.com.demo.annotation.SimpleHelloAnnotation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TextController {
    @PostMapping("name")
    @InfoAnnotation
    public ResponseEntity<?> GetName(@RequestBody String name) {
        return ResponseEntity.ok(name);
    }
    @GetMapping("GetQuote")
    @InfoAnnotation
    public ResponseEntity<?> GetQuote(){
        return ResponseEntity.ok("Java — это не только язык программирования, но и философия программирования, которая научит программистов дисциплине, порядку и инженерному подходу к разработке ПО.");
    }
}
