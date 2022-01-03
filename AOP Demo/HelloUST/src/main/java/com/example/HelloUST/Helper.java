package com.example.HelloUST;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Helper {
//    @Pointcut("execution(public void show())")
//    public void pointcut(){}
//
//    @Before("pointcut()")
//    public void log(){
//        System.out.println("before function execution");
//    }
//
//    @After("pointcut()")
//    public void afterLog(){
//        System.out.println("after function execution");
//    }
//
//    @Around("pointcut()")
//    public void aroundLog(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
//        System.out.println("before aroundLog");
//        proceedingJoinPoint.proceed();
//        System.out.println("after aroundLog");
//    }
//    @AfterReturning("pointcut()")
//    public void afterReturning(){
//        System.out.println("After Returning");
//    }

    @AfterThrowing(value = "execution(public void shown(int))",throwing = "ex")
    public void afterThrowing(IllegalArgumentException ex)throws Throwable{
        System.out.println("after Throwing");
    }



}
