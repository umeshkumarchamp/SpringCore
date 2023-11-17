package com.springcore.standalone_collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.standalone_collection.Model.Person;


public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone_collection/aloneconfig.xml"); 
        System.out.println(context);

        Person p1 = context.getBean("person1",Person.class);
        System.out.println(p1);
        System.out.println(p1.getFriends().getClass().getName());
        Person p2 = context.getBean("person2",Person.class);
        System.out.println("Friends : " +p2.getFriends());
        System.out.println("Courses : " +p2.getCourses());
        System.out.println("Properties : " +p2.getProps());
        System.out.println("Phone : " +p2.getPhone());

        System.out.println(p2.getCourses().getClass().getName());
    }
}
