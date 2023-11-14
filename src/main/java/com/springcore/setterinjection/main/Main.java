package com.springcore.setterinjection.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/setterinjection/config.xml"); 
        System.out.println(context);
        System.out.println(context.getBean("course"));
        System.out.println(context.getBean("umesh"));
    }
}
