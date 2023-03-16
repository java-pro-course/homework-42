package ru.codemika.ans.annotation;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
@RequiredArgsConstructor
@Slf4j
@Data
public class InfoAnnotationAspect {

    @Around(value = "@annotation(infoAnnotation)")
    public Object infoAnnotation(ProceedingJoinPoint proceedingJoinPoint, InfoAnnotation infoAnnotation){
        MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();

        if(methodSignature.getMethod().getName().equals("task2NameMethod")){
            log.info(infoAnnotation.name());
        }
        if(methodSignature.getMethod().getName().equals("task2PhraseMethod")){
            log.info(infoAnnotation.phrase());
        }
        return null;
    }
}
