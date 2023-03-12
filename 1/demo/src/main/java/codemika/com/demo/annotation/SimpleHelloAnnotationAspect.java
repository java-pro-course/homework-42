package codemika.com.demo.annotation;

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
public class SimpleHelloAnnotationAspect {
    @Around(value = "@annotation(simpleHelloAnnotation)")
    public Object text(ProceedingJoinPoint proceedingJoinPoint, SimpleHelloAnnotation simpleHelloAnnotation) throws Throwable {
        log.info(simpleHelloAnnotation.string());
        return proceedingJoinPoint.proceed();
    }
}
