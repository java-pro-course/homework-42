package svarog.edu.annotation.annotation;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Slf4j
@Component
@RequiredArgsConstructor
public class SimpleHelloAnnotationAspect {

    @Around(value = "@annotation(simHelAnn)")
    public Object simpleHelloAnnotation(ProceedingJoinPoint proceedingJoinPoint, SimpleHelloAnnotation simHelAnn) throws Throwable {
        log.info(simHelAnn.text());
        return proceedingJoinPoint.proceed();
    }

}
