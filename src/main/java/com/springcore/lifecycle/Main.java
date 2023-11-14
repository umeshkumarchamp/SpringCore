package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycle_config.xml");
        // System.out.println("============================ MOMO ====================================");
 
        // System.out.println("momo : "+ctx.getBean("momo"));
        ctx.registerShutdownHook();


        // System.out.println("============================== PEPSI ==================================");
        // System.out.println("pepsi : " +ctx.getBean("pepsi"));

        System.out.println("============================== EXAM ==================================");

        System.out.println(ctx.getBean("exam"));

    }
}
