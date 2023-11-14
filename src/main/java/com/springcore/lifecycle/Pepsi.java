package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean , DisposableBean {
    private double price; 

    public Pepsi() {
    }

    public Pepsi(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        System.out.println("Seting Pepsi price : " + price);
        this.price = price;
    }

    @Override
    public String toString() {
        return "{" +
            " price='" + getPrice() + "'" +
            "}";
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        // throw new UnsupportedOperationException("Unimplemented method 'afterPropertiesSet'");

        System.out.println("Taking Pepsi : initalization");
    }

    @Override
    public void destroy() throws Exception {
        // throw new UnsupportedOperationException("Unimplemented method 'destroy'");
        System.out.println("Going to put bottle back to shop : destroy");
    }

}
