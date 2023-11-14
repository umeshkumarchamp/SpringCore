package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Module Name : Spring Core 
 * Created by  : Umesh Kumar 
 * Created on  : 11-11-2023
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
         
        Student umesh = (Student) context.getBean("umesh");
        System.out.println(umesh);

        Object dinesh = context.getBean("dinesh");
        System.out.println(dinesh);

        Object rahul = context.getBean("rahul");
        System.out.println(rahul);

        System.out.println(context);

        System.out.println(context.getBean("std1"));


    }
}
