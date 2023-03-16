package svarog.edu.annotation.api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import svarog.edu.annotation.annotation.InfoAnnotation;
import svarog.edu.annotation.annotation.SimpleHelloAnnotation;

@RestController
@RequiredArgsConstructor
public class MainController {

    @SimpleHelloAnnotation
    @GetMapping("I-love-Codemika")
    public ResponseEntity<?> iLoveCodemika(){
        return ResponseEntity.ok("OK");
    }

    @InfoAnnotation
    @GetMapping("get-program's-author-name")
    public ResponseEntity<?> getProgramAuthorName(){
        return ResponseEntity.ok("Svarog");
    }
    @InfoAnnotation
    @GetMapping("wise-quote")
    public ResponseEntity<?> wiseQuote(){
        return ResponseEntity.ok("Живи так, будто завтра умрешь. Учись так, будто будешь жить вечно");
    }
}