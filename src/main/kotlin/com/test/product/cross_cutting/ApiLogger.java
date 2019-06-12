package com.test.product.cross_cutting;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ApiLogger {
    private Logger logger = LoggerFactory.getLogger(ApiLogger.class);

    @Around("execution(public * com.test.product.application.controller.*.*(..))")
    public Object logger(ProceedingJoinPoint joinPoint){
        logger.info("starting... " + joinPoint.toString());
        Object object = null;
        try {
            object = joinPoint.proceed();
        } catch (Throwable throwable) {
            logger.info("errored out ... ");
            throwable.printStackTrace();
        }
        logger.info("ending... " + joinPoint.toString());
        return object;
    }

}
