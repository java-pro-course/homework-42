package codemika.com.demo.annotation;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Aspect
@Component
@Slf4j
public class infoAnnotationAspect {
    @Around(value = "@annotation(infoAnnotation)")
    public Object infoAnnotation(ProceedingJoinPoint proceedingJoinPoint, InfoAnnotation infoAnnotation) throws Throwable {
        MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();
        String name = methodSignature.getMethod().getName();
        log.info("You called a method by name: " + name);
        return proceedingJoinPoint.proceed();
    }
}
