package com.enotion.annotationconfig;

import com.enotion.model.MyBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AspectApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        MyBean beanObj = ctx.getBean(MyBean.class);
        beanObj.hello();
    }
}
