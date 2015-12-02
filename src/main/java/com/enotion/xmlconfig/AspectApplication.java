package com.enotion.xmlconfig;

import com.enotion.annotationconfig.AppConfig;
import com.enotion.model.MyBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class AspectApplication {
    public static void main(String[] args) {
        System.out.println("[MAIN] Start application!");
        ApplicationContext ctx = new FileSystemXmlApplicationContext("app_config.xml");
        MyBean beanObj = ctx.getBean(MyBean.class);

        System.out.println("[MAIN] Going to execute hello()");
        beanObj.hello();
        System.out.println("----------------------------------------------------------------------");

        try {
            System.out.println("[MAIN] Going to execute helloThrow()");
            beanObj.helloThrow();
        } catch (Exception e) {
            System.out.println("[MAIN] Exception swallowed.");
        }
        System.out.println("----------------------------------------------------------------------");

        System.out.println("[MAIN] Going to execute xmlHello(Mario)");
        beanObj.xmlHello("Mario");
        System.out.println("----------------------------------------------------------------------");
    }
}
