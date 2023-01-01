package com.java.springAopWithoutLogger.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AnimalAspect {

    @Before("execution(* com.java.springAopWithoutLogger.dao.AnimalDaoImpl.sound(..))")
    public void before(JoinPoint joinPoint){
        Object[] methodArgs = joinPoint.getArgs();
        System.out.println("before aspect execution");
        System.out.println("Input to Method :" + joinPoint.getSignature().getName() + " with args :");
    }
    @After("execution(* com.java.springAopWithoutLogger.dao.AnimalDaoImpl.sound(..))")
    public void after(){
        System.out.println("after execution");
    }
   // @Around("execution(* com.java.springAopWithoutLogger.dao.AnimalDaoImpl.sound(..))")
    public void around(){
        System.out.println("around advice");
    }


}
