package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

    @Value("#{systemProperties['user.name']}")
    private String name;

    @Value("6201033951")
    private String phone;

    @Value("#{T(java.lang.Math).PI * 6 * 6}")
    private double area;

    @Value("#{employee.calculate(8)}")
    private int calculatedValue;
    

    public static int calculate(int n){
        n = n*10; 
        return n;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getArea() {
        return this.area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getCalculatedValue() {
        return this.calculatedValue;
    }

    public void setCalculatedValue(int calculatedValue) {
        this.calculatedValue = calculatedValue;
    }


    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", phone='" + getPhone() + "'" +
            ", area='" + getArea() + "'" +
            ", calculatedValue='" + getCalculatedValue() + "'" +
            "}";
    }
    

}
