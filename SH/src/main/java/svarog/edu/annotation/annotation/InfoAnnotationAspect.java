package svarog.edu.annotation.annotation;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Slf4j
@Component
@RequiredArgsConstructor
public class InfoAnnotationAspect {
    @Around(value = "@annotation(infoAnnotation)")
    public Object infoAnnotation(ProceedingJoinPoint proceedingJoinPoint, InfoAnnotation infoAnnotation) throws Throwable {
        MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();
        String methodName = methodSignature.getName();
        log.info("A user has called the " + methodName + " method");
        return proceedingJoinPoint.proceed();
    }
}
