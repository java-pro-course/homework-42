package codemika.com.demo;

import codemika.com.demo.annotation.SimpleHelloAnnotation;
import lombok.extern.slf4j.Slf4j;

@org.springframework.stereotype.Service
@Slf4j
public class Service {
    public static String text(String s){
        log.info(s);
        return "ok";
    }
}
