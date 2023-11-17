package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/stereotype/config.xml"); 
        System.out.println(con.getBean("bank"));
        Bank bank = con.getBean("bank", Bank.class); 
        bank.setBankName("Punjab National Bank");
        bank.setBankAddress("Argora Ranchia");
        System.out.println(bank);
        System.out.println(bank.hashCode());
        System.out.println("========================= Student =======================================");

        System.out.println(con.getBean("student"));
        Student std = con.getBean("student", Student.class);
        System.out.println(std.getCourses().getClass().getName());
        System.out.println("Hash Code : "+std.hashCode());


        Student std2 = con.getBean("student", Student.class); 
        std2.setId(2);
        std2.setName("Sudheer Kumar");
        std2.setEmail("sudhir@gmail.com");
        std2.setAge(25);
        std2.setAddress("New Delhi");
        System.out.println(std2);
        System.out.println("Hash Code : "+std2.hashCode());

        System.out.println("============================ Teacher ====================================");
        Teacher t1 = con.getBean("teacher", Teacher.class);
        System.out.println("Hash Code : "+t1.hashCode());
        Teacher t2 = con.getBean("teacher", Teacher.class);
        System.out.println("Hash Code : "+t2.hashCode());

        System.out.println("================================================================");
        // MyComponent product = con.getBean("product", MyComponent.class);
        // System.out.println(product);

    }
}
