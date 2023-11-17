package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springcore.javaconfig.model.MyBean;

public class Main {
    public static void main(String[] args) {
        
        ApplicationContext con = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println(con);

        MyBean bean = con.getBean("bean",MyBean.class);
        System.out.println(bean);

        System.out.println(bean.getMessage());
        bean.getSamosa().display();
        
    }
}
