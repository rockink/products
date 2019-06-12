package com.test.product.cross_cutting;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ProductRepositoryMetricsAdvice{

    private long repoCallCount = 0;
    private Logger logger = LoggerFactory.getLogger(ProductRepositoryMetricsAdvice.class);

    @Before("@annotation(ProductRepositoryMetrics)")
    public void metricAdvice(JoinPoint joinPoint){
        repoCallCount++;
        logger.info("sending repository call metrics to stat service... " + repoCallCount);
    }

}
