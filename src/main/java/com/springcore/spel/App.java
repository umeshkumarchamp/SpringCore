package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/spel/config.xml"); 
        System.out.println("=================== Demo =============================");
        Demo d1 = con.getBean("demo", Demo.class);
        // d1.setX(35);
        // d1.setY(89);
        System.out.println(d1);

        System.out.println("====================== My Bean ==========================");
        MyBean bean = con.getBean(MyBean.class);
        System.out.println(bean);
        System.out.println(bean.calculateArea());

        System.out.println("==================== Employee ============================");
        Employee emp = con.getBean(Employee.class);
        System.out.println(emp);
    }
}
