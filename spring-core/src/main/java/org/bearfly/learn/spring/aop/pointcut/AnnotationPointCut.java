package org.bearfly.learn.spring.aop.pointcut;

import lombok.Data;
import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author bearfly1990
 * @date 2022/4/24
 */
@Data
@Log4j2
@Aspect
public class AnnotationPointCut {
    @Before("execution(* org.bearfly.learn.spring.aop.service.UserServiceImpl.*(..))")
    public void before(){
        log.info(this.getClass().getName() + " BEFORE");
    }

    @After("execution(* org.bearfly.learn.spring.aop.service.UserServiceImpl.*(..))")
    public void after(){
        log.info(this.getClass().getName() + " AFTER");
    }

    @Around("execution(* org.bearfly.learn.spring.aop.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        log.info(this.getClass().getName() + " around");
        log.info("Before around");
        log.info("getSignature():"+jp.getSignature());
        Object proceed = jp.proceed();
        log.info("After around");
    }
}
