package com.enotion.annotationconfig;

import com.enotion.model.MyAspect;
import com.enotion.model.MyBean;
import com.enotion.model.MyBeanImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AppConfig {

    @Bean
    MyBean getMyBean() {
        return new MyBeanImpl();
    }

    @Bean
    MyAspect getMyAspect() {
        return new MyAspect();
    }


}
