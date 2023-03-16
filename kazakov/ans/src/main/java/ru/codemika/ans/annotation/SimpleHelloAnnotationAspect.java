package ru.codemika.ans.annotation;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
@RequiredArgsConstructor
@Slf4j
@Data
public class SimpleHelloAnnotationAspect {
    @Around(value = "@annotation(simpleHelloAnnotation)")
    public Object simpleHelloAnnotation(ProceedingJoinPoint proceedingJoinPoint, SimpleHelloAnnotation simpleHelloAnnotation) throws Throwable{
        for (int i = 0; i < 3; i++) {
            log.info(simpleHelloAnnotation.message());
        }
        return proceedingJoinPoint.proceed();
    }

}
