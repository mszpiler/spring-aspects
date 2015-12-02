package com.enotion.model;
import org.aspectj.lang.annotation.*;

@Aspect
public class MyAspect {

    @Pointcut("execution(* com.enotion.model.MyBean.hello(..))")
    public void pointCutOne() {}

    @Pointcut("execution(* com.enotion.model.MyBean.helloThrow(..))")
    public void pointCutTwoThrow() {}

    @Before("pointCutOne()")
    public void beforeExec()  {
        System.out.println("[MyAspect] Before exec");
    }

    @AfterReturning("pointCutOne()")
    public void afterReturnOK() {
        System.out.println("[MyAspect] Method executed properly!");
    }

    @AfterThrowing("pointCutTwoThrow()")
    public void afterReturnError() {
        System.out.println("[MyAspect] Method executed with Exception");
    }
}
