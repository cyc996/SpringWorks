package com.work.Aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * 执行任何公共方法：
 *
 * execution(public * *(..))
 * 执行名称以以下开头的任何方法set：
 *
 * execution(* set*(..))
 * 执行AccountService接口定义的任何方法：
 *
 * execution(* com.xyz.service.AccountService.*(..))
 * 执行service包中定义的任何方法：
 *
 * execution(* com.xyz.service.*.*(..))
 * 执行服务包或其子包中定义的任何方法：
 *
 * execution(* com.xyz.service..*.*(..))
 * 服务包中的任何连接点（仅在Spring AOP中执行方法）：
 *
 * within(com.xyz.service.*)
 * 服务包或其子包中的任何连接点（仅在Spring AOP中执行方法）：
 *
 * within(com.xyz.service..*)
 * 代理实现AccountService接口的任何连接点（仅在Spring AOP中执行方法） ：
 *
 * this(com.xyz.service.AccountService)*/
@Component
@Aspect
public class AopDeamo  {

    /*声明切入点*/
    @Pointcut("execution(* com.work.service.*.*(..))")
    public void Pointcut(){
        System.out.println("声明切入点");
    }
    @After("Pointcut()")
    public void After(){
        System.out.println("后置通知：方法之后执行");
    }
    @Before("Pointcut()")
    public void Before(){
        System.out.println("前置通知：方法之前执行");
    }
    @AfterReturning("Pointcut()")
    public void AfterReturning(){
        System.out.println("后置通知：方法之后执行ing");
    }
    @Around("Pointcut()")
    public Object around(JoinPoint joinPoint) throws Throwable {

        System.out.println("环绕通知:方法前执行");
        ProceedingJoinPoint proceedingJoinPoint=(ProceedingJoinPoint)joinPoint;

        Object proceed = proceedingJoinPoint.proceed();//这个是执行目标方法的代码
        System.out.println("环绕通知:方法后执行");
        return proceed;
    }


}
