package com.mera.borisgk98.autoshowroom.server.prometheus.aspects;

import com.mera.borisgk98.autoshowroom.server.prometheus.annotations.Counter;
import io.micrometer.core.instrument.Metrics;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
//@Configuration
@Component
public class CounterAspect {

    private Logger logger = LoggerFactory.getLogger(CounterAspect.class);

    @Pointcut("@annotation(com.mera.borisgk98.autoshowroom.server.prometheus.annotations.Counter)")
    public void pointcut() {}

    @Around("pointcut()")
    public Object before(ProceedingJoinPoint call) throws Throwable{
        MethodSignature signature = (MethodSignature) call.getSignature();
        Method method = signature.getMethod();

        Counter counter = method.getAnnotation(Counter.class);
        String metric = counter.metric();
        logger.info("Count prometheus metric \"" + metric + "\"");
        Metrics.counter(metric).increment();
        return call.proceed();
    }
}
