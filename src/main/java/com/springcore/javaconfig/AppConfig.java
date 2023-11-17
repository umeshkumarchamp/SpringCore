package com.springcore.javaconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springcore.javaconfig.model.MyBean;
import com.springcore.javaconfig.model.Samosa;

@Configuration
public class AppConfig {

    @Bean
    public Samosa samosa(){
        return new Samosa();
    }

    @Bean(name = {"bean"})
    public MyBean myBean(@Value("#{systemProperties['user.name']}") String userName) {
        MyBean myBean = new MyBean(samosa());
        myBean.setMessage("Hello, " + userName + "!");
        return myBean;
    }
}

