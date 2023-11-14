package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collection/collection_config.xml"); 
        
        Employee emp = (Employee)context.getBean("employee");

        emp.setEmployeeName("John Smith");
        System.out.println("Name : " +emp.getEmployeeName());
        System.out.println("Phone : " +emp.getPhones());
        System.out.println("Address : " +emp.getAddresses());
        System.out.println("Courses : " +emp.getCourses());
        System.out.println("Properties : " +emp.getProps());
        System.out.println(emp.getPhones().getClass().getName());
        
    }

    
}
