package com.enotion.model;


import org.aspectj.lang.ProceedingJoinPoint;

public class MyXmlAspect {

    public void aspectBeforeMethod(String firstName) throws Throwable {
        System.out.println("[MyXmlAspect][aspectBeforeMethod] catched method with firstName="+firstName);
    }
}
