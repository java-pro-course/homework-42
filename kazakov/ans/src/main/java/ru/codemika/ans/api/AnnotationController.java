package ru.codemika.ans.api;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.codemika.ans.annotation.InfoAnnotation;
import ru.codemika.ans.annotation.SimpleHelloAnnotation;

@RestController
@RequiredArgsConstructor
@Slf4j
public class AnnotationController {
    @SimpleHelloAnnotation(message = "I love Codemika!")
    @GetMapping("task1")
    public ResponseEntity<?> task1Method(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body("task1 method is used");
    }

    @InfoAnnotation(name = "Roma", phrase = "This is Elon Musk. Tesla's co-founder and CEO. " +
            "Elon is an inventor and a maverick entrepreneur one of America's youngest billionaires...")
    @GetMapping("task2-name")
    public ResponseEntity<?> task2NameMethod(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body("task2-name method is used");
    }

    @InfoAnnotation(name = "Roma", phrase = "This is Elon Musk. Tesla's co-founder and CEO. " +
            "Elon is an inventor and a maverick entrepreneur one of America's youngest billionaires...")
    @GetMapping("task2-phrase")
    public ResponseEntity<?> task2PhraseMethod(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body("task2-phrase method is used");
    }

}
