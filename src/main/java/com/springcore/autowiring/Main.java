package com.springcore.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext contex = new ClassPathXmlApplicationContext("com/springcore/autowiring/autowired_config.xml"); 
        Employee emp = contex.getBean("emp", Employee.class);
        System.out.println("Name : "+emp.getName());
        System.out.println("Address : "+emp.getAddress().getState());
    }
}
