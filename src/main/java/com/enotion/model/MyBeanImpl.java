package com.enotion.model;

public class MyBeanImpl implements MyBean {
    public MyBeanImpl() {
        System.out.println("[MyBeanImpl] MyBeanImpl created!");
    }

    public void hello() {
        System.out.println("[MyBeanImpl] Execute method MyServiceIml!");
    }

    public void helloThrow() {
        System.out.println("[MyBeanImpl] I'm going to throw Exception...");
        throw new RuntimeException();
    }

    public void xmlHello(String firstName) {
        System.out.println("[MyBeanImpl] Execute xmlHello() firstName=" + firstName);
    }


}
